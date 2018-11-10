package assignment_4.analytics;

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
    
    //1. Our top 3 most popular product sorted from high to low
    
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
        System.out.println("\nTop 3 Most Popular Products are\n");
        for(int i=(rankMapList.size()-1);i>=(rankMapList.size()-3);i--){ //since TreeMap is in ascending order of keys
            for(int j=0;j<rankMapList.get(i).getValue().size();j++){
                System.out.println("Prodouct Id: "+rankMapList.get(i).getValue().get(j)+" with Total Orders: "+rankMapList.get(i).getKey());
            }
        }
        System.out.println("\n");
        
    }
       
}
