/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics.Analyzers;

import assignment_4.analytics.DataStore;
import assignment_4.entities.Customer;
import assignment_4.entities.Order;
import assignment_4.entities.SalesPerson;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class TopThreeSalesPersonAnalyzer extends TopThreeAnalyzer{

    @Override
    protected void displayAnalytics(Object result) {
        List<Map.Entry<Integer, ArrayList>> printlist = new ArrayList<>(((Map)result).entrySet());
         
        System.out.println("Our 3 best Sales People: ");
        Map<Integer,SalesPerson> salesMap = DataStore.getInstance().getSalesPersonDir();
        for(int i = 0;i<printlist.size() && i<3;i++){
            for(Integer id : (ArrayList<Integer>)printlist.get(printlist.size()-1-i).getValue()){
                System.out.println(i+1+") Supplier ID: "+ id+
                        " Name: "+salesMap.get(id).getFname()+" "+salesMap.get(id).getLname()+
                        " revenue: $" + printlist.get(printlist.size()-1-i).getKey());
            }
        }   
    }

    @Override
    protected Integer getID(Order order) {
        return order.getSupplierId();
    }
    
}
