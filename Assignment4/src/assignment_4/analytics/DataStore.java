/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Akshay, Ninad, Saurabh
 */
public class DataStore {

    private static DataStore dataStore;

    private final Map<Integer, Order> orders;
    private final Map<Integer, Product> productCatalog;
    private final Map<Integer, Customer> customerDir;
    private final Map<Integer, SalesPerson> salesPersonDir;

    private DataStore() {
        orders = new HashMap<>();
        productCatalog = new HashMap<>();
        customerDir = new HashMap<>();
        salesPersonDir = new HashMap<>();
    }

    public static DataStore getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore();
        }
        return dataStore;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public Map<Integer, Product> getProductCatalog() {
        return productCatalog;
    }

    public Map<Integer, Customer> getCustomerDir() {
        return customerDir;
    }

    public Map<Integer, SalesPerson> getSalesPersonDir() {
        return salesPersonDir;
    }
    
}
