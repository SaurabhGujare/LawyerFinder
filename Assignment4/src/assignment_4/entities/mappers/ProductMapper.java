/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities.mappers;

import assignment_4.entities.Product;
import assignment_4.entities.interfaces.Mapper;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class ProductMapper implements Mapper<Product>{

    @Override
    public Product mapToObject(String[] row) {
        Product product = new Product(Integer.parseInt(row[0]), Integer.parseInt(row[1]), Integer.parseInt(row[2]), Integer.parseInt(row[3]));
        return product;
    }

    @Override
    public Object getKey(String[] row) {
        return Integer.parseInt(row[0]);
    }
    
}
