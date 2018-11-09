package assignment_4.analytics;

import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.util.Map;

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
        
        System.out.println("The total revenue for the year:"+total);
    }
}
