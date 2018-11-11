/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics.Analyzers;

import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class TopThreeProductAnalyzerByOccurence extends TopThreeProductsAnalyzer{

    @Override
    protected Integer calculateValue(Order order, Map<Integer, Product> productMap) {
        return 1;
    }

    @Override
    protected void displayAnalytics(Object result) {
        List<Map.Entry<Integer, ArrayList>> rankMapList = new ArrayList<>(((Map) result).entrySet());
         
        System.out.println("Top 3 Most Popular Products are");
        for(int i=0;i < 3 && i < rankMapList.size();i++){
            for(int prodId :(ArrayList<Integer>)rankMapList.get(rankMapList.size()-1-i).getValue()){
                System.out.println(i+1+") Product Id: "+prodId+
                        " with total occurances: "+rankMapList.get(rankMapList.size()-1-i).getKey());
            }
        }
    }
    
    
    
}
