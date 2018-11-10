/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.interfaces.Mapper;
import assignment_4.entities.mappers.CustomerMapper;
import assignment_4.entities.mappers.OrderMapper;
import assignment_4.entities.mappers.ProductMapper;
import assignment_4.entities.mappers.SalesPersonMapper;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ninad
 */
public class GateWay {
    
    public static void main(String args[]) throws IOException{
        
        DataGenerator generator = DataGenerator.getInstance();
        
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        populateMap(DataStore.getInstance().getOrders(), orderReader, new OrderMapper());

        DataReader productReader = new DataReader(generator.getProductCataloguePath());
        populateMap(DataStore.getInstance().getProductCatalog(), productReader, new ProductMapper());
        
        DataReader customerReader = new DataReader(generator.getCUSTOMER_DIR_PATH());
        populateMap(DataStore.getInstance().getCustomerDir(), customerReader, new CustomerMapper());
        
        DataReader salesReader = new DataReader(generator.getSALESPERSON_DIR_PATH());
        populateMap(DataStore.getInstance().getSalesPersonDir(), salesReader, new SalesPersonMapper());
        
        doAnalytics();
    }
    
    public static void populateMap(Map map,DataReader reader,Mapper mapper) {
        
        String[] row;
        try {
            while((row = reader.getNextRow()) != null){
                map.put(mapper.getKey(row), mapper.mapToObject(row));
            }
        } catch (IOException ex) {
            Logger.getLogger(GateWay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void doAnalytics() {
//        AnalysisHelper.getTop3MostPopularProduct();
//        AnalysisHelper.getTotalRevenueForYear();
        AnalysisHelper.threeBestCustomers();
    }
    
}
