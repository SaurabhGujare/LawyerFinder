/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics.Analyzers;

import assignment_4.entities.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class TopThreeProductsAnalyzer extends TopThreeAnalyzer{

    @Override
    protected Integer getID(Order order) {
        return order.getItem().getProductId();
    }

    @Override
    protected void displayAnalytics(Object result) {
        List<Map.Entry<Integer, ArrayList>> rankMapList = new ArrayList<>(((Map) result).entrySet());
         
        //Print the prod-id and its total order 
        System.out.println("Top 3 Most Popular Products are");
        for(int i=(rankMapList.size()-1);i>=(rankMapList.size()-3);i--){ //since TreeMap is in ascending order of keys
            for(int j=0;j<rankMapList.get(i).getValue().size();j++){
                System.out.println("Prodouct Id: "+rankMapList.get(i).getValue().get(j)+" with Total Revenue: $"+rankMapList.get(i).getKey());
            }
        }
    }

    
    
}
