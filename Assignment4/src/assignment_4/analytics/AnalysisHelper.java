package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class AnalysisHelper {
    
    public static void getTotalRevenueForYear(){
        int total = 0;
        Map<Integer,Order> orderMap = DataStore.getInstance().getOrders();
        Map<Integer,Product> prodMap = DataStore.getInstance().getProductCatalog();
        for(Order order: orderMap.values()){
            total = total + order.getItem().getQuantity() * 
                    (order.getItem().getSalesPrice()-prodMap.get(order.getItem().getProductId()).getMin());
        }
        
        System.out.println("The total revenue for the year: $"+total+"\n");
    }
    
    public static void threeBestCustomers(){
    
        int custId = 0;
        int totalPrice = 0;
        
        Map<Integer, Integer>revmap = new HashMap<>() ;    // Map to get the customer ID and corresponding total profit against selected person    
        Map<Integer, Order> orderMap = DataStore.getInstance().getOrders(); // Map of Orders
        Map<Integer, Product> productMap = DataStore.getInstance().getProductCatalog(); // Map of Products
        Map<Integer, ArrayList>rankmap= new TreeMap<>(); // TreeMap to tackel the condition of same total price for different customers.
      
        // Traversing the order map to get the customer and total price
        for(Order order: orderMap.values()){
            custId= order.getCustomerId();
            totalPrice = (order.getItem().getQuantity())*(order.getItem().getSalesPrice()-productMap.get(order.getItem().getProductId()).getMin());
            if(revmap.containsKey(custId)){
                    revmap.put(custId,revmap.get(custId)+totalPrice);                                   
            }
            else{
                revmap.put(custId,totalPrice);
            }  
        }
          
        // traversing the TreeMap
        for(Map.Entry<Integer, Integer> entry: revmap.entrySet()){
            if(rankmap.containsKey(entry.getValue())){
                    rankmap.get(entry.getValue()).add(entry.getKey()); 
            }
            else{
                    ArrayList<Integer> custIdArrayList = new ArrayList<>();
                    custIdArrayList.add(entry.getKey());
                    rankmap.put(entry.getValue(), custIdArrayList);
            }
        }    
         List<Map.Entry<Integer, ArrayList>> printlist = new ArrayList<>(rankmap.entrySet());
         
         // printing the 1st three  CustomerIDs 
        System.out.println("Our 3 best Customers: ");
        
        for(int i = 0;i<printlist.size() && i<3;i++){
            for(Integer id : (ArrayList<Integer>)printlist.get(printlist.size()-1-i).getValue()){
                System.out.println("CustomerID: "+ id);
            }
        }        
    }
    
    public static void threeBestSalesPeople(){
    
        int supplierId = 0;
        int totalProfit = 0;
        
        Map<Integer, Integer>revmap = new HashMap<>() ;        
        Map<Integer, Order> orderMap = DataStore.getInstance().getOrders();
        Map<Integer, Product> productMap = DataStore.getInstance().getProductCatalog();
        Map<Integer, ArrayList>rankmap= new TreeMap<>();
      
        for(Order order: orderMap.values()){
            supplierId= order.getSupplierId();
            totalProfit = (order.getItem().getQuantity())*(order.getItem().getSalesPrice()-productMap.get(order.getItem().getProductId()).getMin());
            if(revmap.containsKey(supplierId)){
                    revmap.put(supplierId,revmap.get(supplierId)+totalProfit);                                   
            }
            else{
                revmap.put(supplierId,totalProfit);
            }  
        }
            
        for(Map.Entry<Integer, Integer> entry: revmap.entrySet()){
            if(rankmap.containsKey(entry.getValue())){
                    rankmap.get(entry.getValue()).add(entry.getKey()); 
            }
            else{
                    ArrayList<Integer> custIdArrayList = new ArrayList<>();
                    custIdArrayList.add(entry.getKey());
                    rankmap.put(entry.getValue(), custIdArrayList);
            }
        }    
         List<Map.Entry<Integer, ArrayList>> printlist = new ArrayList<>(rankmap.entrySet());
         
        System.out.println("Our 3 best Sales People: ");
        
        for(int i = 0;i<printlist.size() && i<3;i++){
            for(Integer id : (ArrayList<Integer>)printlist.get(printlist.size()-1-i).getValue()){
                System.out.println("Supplier ID: "+ id);
            }
        }        
    }
    
     //1.1 Our top 3 most popular product sorted from high to low w.r.t Orders
    
    public static void getTop3MostPopularProduct(){
        /*Stores the prod id and its count corresponding to no og orders into the countMap*/
        Map<Integer,Integer> countMap = new HashMap<>();
        Map<Integer,Order> orderMap = DataStore.getInstance().getOrders();
        
        for(Order order: orderMap.values()){
            int prodId = order.getItem().getProductId();
            if(countMap.containsKey(prodId))
                countMap.put(prodId, countMap.get(prodId)+1);
            else
                countMap.put(prodId, 1);   
        }
        
        /*Swap key and values of countMap into the rankMap*/
        Map<Integer, ArrayList> rankMap = new TreeMap<>();
        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            if(rankMap.containsKey(entry.getValue()))
                rankMap.get(entry.getValue()).add(entry.getKey());
            else{
               ArrayList<Integer> arrList = new ArrayList<Integer>();
               arrList.add(entry.getKey());
               rankMap.put(entry.getValue(), arrList);
            }        
        }
        
        //Convert TreeMap into the List
        List<Map.Entry<Integer, ArrayList>> rankMapList = new ArrayList<>(rankMap.entrySet());
         
        //Print the prod-id and its total order
        System.out.println("\nTop 3 Most Popular Products w.r.t orders are\n");
        for(int i=(rankMapList.size()-1);i>=(rankMapList.size()-3);i--){ //since TreeMap is in ascending order of keys
            for(int j=0;j<rankMapList.get(i).getValue().size();j++){
                System.out.println("Prodouct Id: "+rankMapList.get(i).getValue().get(j)+" with Total Orders: "+rankMapList.get(i).getKey());
            }
        }
        System.out.println("\n");
        
    }
    
    //1.2 Our top 3 most popular product sorted from high to low w.r.t Revenue
    
    public static void getTop3MostPopularProductRev(){
       Map<Integer,Integer> countMap = new HashMap<>();
       Map<Integer,Order> orderMap = DataStore.getInstance().getOrders();
       Map<Integer,Product> prodMap = DataStore.getInstance().getProductCatalog();
        
       for(Order order: orderMap.values()){
           int prodId = order.getItem().getProductId();
           if(countMap.containsKey(prodId)){
               countMap.put(prodId, countMap.get(prodId)+order.getItem().getQuantity() * 
                   (order.getItem().getSalesPrice()-prodMap.get(order.getItem().getProductId()).getMin()));
           }
           else{
               countMap.put(prodId, (order.getItem().getQuantity()) * (order.getItem().getSalesPrice()-prodMap.get(order.getItem().getProductId()).getMin()));
           }
       }
       
       /*Swap key and values of countMap into the rankMap*/
        Map<Integer, ArrayList> rankMap = new TreeMap<>();
        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            if(rankMap.containsKey(entry.getValue()))
                rankMap.get(entry.getValue()).add(entry.getKey());
            else{
               ArrayList<Integer> arrList = new ArrayList<Integer>();
               arrList.add(entry.getKey());
               rankMap.put(entry.getValue(), arrList);
            }        
        }
        
        //Convert TreeMap into the List
        List<Map.Entry<Integer, ArrayList>> rankMapList = new ArrayList<>(rankMap.entrySet());
         
        //Print the prod-id and its total order 
        System.out.println("\nTop 3 Most Popular Products w.r.t revenue are\n");
        for(int i=(rankMapList.size()-1);i>=(rankMapList.size()-3);i--){ //since TreeMap is in ascending order of keys
            for(int j=0;j<rankMapList.get(i).getValue().size();j++){
                System.out.println("Prodouct Id: "+rankMapList.get(i).getValue().get(j)+" with Total Revenue: $"+rankMapList.get(i).getKey());
            }
        }
        System.out.println("\n");
    }
       
}
