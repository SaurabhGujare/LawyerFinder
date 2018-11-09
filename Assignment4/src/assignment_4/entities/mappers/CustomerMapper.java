/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities.mappers;

import assignment_4.entities.Customer;
import assignment_4.entities.interfaces.Mapper;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class CustomerMapper implements Mapper<Customer>{

    @Override
    public Customer mapToObject(String[] row) {
        return new Customer(Integer.parseInt(row[0]), row[1], row[2]);
    }

    @Override
    public Object getKey(String[] row) {
        return Integer.parseInt(row[0]);
    }
    
}
