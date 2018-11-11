/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.Analyzers.Analyzer;
import assignment_4.analytics.DataStore;
import assignment_4.entities.interfaces.Mapper;
import assignment_4.entities.mappers.CustomerMapper;
import assignment_4.entities.mappers.OrderMapper;
import assignment_4.entities.mappers.ProductMapper;
import assignment_4.entities.mappers.SalesPersonMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ninad
 */
public class GateWay {

    public static void main(String args[]) throws IOException {

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

    public static void populateMap(Map map, DataReader reader, Mapper mapper) {

        String[] row;
        try {
            while ((row = reader.getNextRow()) != null) {
                map.put(mapper.getKey(row), mapper.mapToObject(row));
            }
        } catch (IOException ex) {
            Logger.getLogger(GateWay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void doAnalytics() {

        int selectedOption = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (selectedOption != AnalysisHelper.EXIT_CASE) {
            System.out.println("\n---Analytics---");
            System.out.println("Please select an option from below:");
            System.out.println("1. Top 3 most popular product by revenue");
            System.out.println("2. Top 3 most popular product by occurence");
            System.out.println("3. Top 3 best customers");
            System.out.println("4. Top 3 best sales people");
            System.out.println("5. Total revenue for the year");
            System.out.println("6. Exit");
            System.out.print("Enter your option here:");

            try {
                selectedOption = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("***Invalid input. Please select a number.***");
                continue;
            }
            Analyzer analyzer = AnalysisHelper.getAnalyzer(selectedOption);
            if(analyzer != null)
                analyzer.analyze(DataStore.getInstance());
        }

    }

}
