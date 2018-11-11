/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics.Analyzers;

import assignment_4.analytics.DataStore;
import static assignment_4.analytics.AnalysisHelper.getProfitGenerated;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public abstract class TopThreeAnalyzer implements Analyzer{
    
    protected static final int MAX_RECORDS = 3;
    protected abstract Integer getID(Order order);
    protected abstract void displayAnalytics(Object result);
    
    @Override
    public void analyze(DataStore dataStore) {
        Map<Integer, Order> orderMap = dataStore.getOrders();
        Map<Integer, Product> productMap = dataStore.getProductCatalog();
        
        Map<Integer, Integer>resultMap = new HashMap<>() ;  
        
        for(Order order: orderMap.values()){
            Integer id= getID(order);
            Integer totalPrice = calculateValue(order, productMap);
            
            if(resultMap.containsKey(id)){
                    resultMap.put(id,resultMap.get(id)+totalPrice);                                   
            }
            else{
                resultMap.put(id,totalPrice);
            }  
        }
            
        Map rankMap = getRankMap(resultMap);
        
        displayAnalytics(rankMap);
              
    }
    
    protected Integer calculateValue(Order order, Map<Integer,Product> productMap){
        return getProfitGenerated(order.getItem(),productMap.get(order.getItem().getProductId()));
    }
    
    private Map<Integer,ArrayList> getRankMap(Map<Integer,Integer> map){
        
        Map<Integer, ArrayList>rankMap= new TreeMap<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(rankMap.containsKey(entry.getValue())){
                    rankMap.get(entry.getValue()).add(entry.getKey()); 
            }
            else{
                    ArrayList<Object> list = new ArrayList<>();
                    list.add(entry.getKey());
                    rankMap.put(entry.getValue(), list);
            }
        }
        
        return rankMap;
    }
    
}
