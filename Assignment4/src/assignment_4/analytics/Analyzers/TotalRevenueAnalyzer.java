/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics.Analyzers;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.util.Map;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class TotalRevenueAnalyzer implements Analyzer {

    @Override
    public void analyze(DataStore dataStore) {
        int total = 0;
        Map<Integer,Order> orderMap = dataStore.getOrders();
        Map<Integer,Product> prodMap = dataStore.getProductCatalog();
        for(Order order: orderMap.values()){
            total = total + AnalysisHelper.getProfitGenerated(order.getItem(),prodMap.get(order.getItem().getProductId()));
        }
        
        System.out.println("The total revenue for the year: $"+total);
    }
    
}
