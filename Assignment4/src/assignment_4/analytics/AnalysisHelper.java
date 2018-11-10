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
    
    public void getTotalRevenueForYear(){
        
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
        Map<Integer, ArrayList> rankMap = new HashMap<>();
        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            if(rankMap.containsValue(entry.getValue()))
                rankMap.get(entry.getValue()).add(entry.getKey());
            else{
               ArrayList<Integer> arrList = new ArrayList<Integer>();
               arrList.add(entry.getKey());
               rankMap.put(entry.getValue(), arrList);
            }        
        }
        //Sort the rankMap in descending order of its key
        Comparator<Map.Entry<Integer, ArrayList>> com = new Comparator<Map.Entry<Integer, ArrayList>>(){

            @Override
            public int compare(Map.Entry<Integer, ArrayList> o1, Map.Entry<Integer, ArrayList> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
            
        };
        
        //Convert HashMap into the List
        List<Map.Entry<Integer, ArrayList>> rankMapList = new ArrayList<>(rankMap.entrySet());
        
        //call sort method
        Collections.sort(rankMapList, com);
        
        //Print the prod id and its total order
        System.out.println("\nTop 3 Most Popular Products are\n");
        for(int i=0;i<rankMapList.size();i++){
            for(int j=0;j<rankMapList.get(i).getValue().size();j++){
                System.out.println("prod Id "+rankMapList.get(i).getValue().get(j)+" Total Orders "+rankMapList.get(i).getKey());
            }
        System.out.println("*********");
        }
        
    }
       
}
