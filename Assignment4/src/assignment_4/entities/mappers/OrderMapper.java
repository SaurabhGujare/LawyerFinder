/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities.mappers;

import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.interfaces.Mapper;
/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 * @param <Order>
 */
public class OrderMapper implements Mapper<Order>{

    @Override
    public Order mapToObject(String[] row) {
        
        Item item = new Item(Integer.parseInt(row[2]), Integer.parseInt(row[6]), Integer.parseInt(row[3]));
        Order order = new Order(Integer.parseInt(row[0]), Integer.parseInt(row[4]), Integer.parseInt(row[5]), item);
        return order;
        
    }

    @Override
    public Object getKey(String[] row) {
        return Integer.parseInt(row[0]);
    }
    
}
