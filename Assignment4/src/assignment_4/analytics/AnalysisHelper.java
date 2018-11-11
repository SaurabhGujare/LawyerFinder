package assignment_4.analytics;

import assignment_4.analytics.Analyzers.Analyzer;
import assignment_4.analytics.Analyzers.TopThreeCustomersAnalyzer;
import assignment_4.analytics.Analyzers.TopThreeProductAnalyzerByOccurence;
import assignment_4.analytics.Analyzers.TotalRevenueAnalyzer;
import assignment_4.analytics.Analyzers.TopThreeSalesPersonAnalyzer;
import assignment_4.analytics.Analyzers.TopThreeProductsAnalyzer;
import assignment_4.entities.Item;
import assignment_4.entities.Product;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class AnalysisHelper {

    public static final int EXIT_CASE = 6;
    public static int getProfitGenerated(Item item, Product product) {
        return item.getQuantity() * (item.getSalesPrice() - product.getMin());
    }

    public static Analyzer getAnalyzer(Integer option) {
        switch (option) {
            case 1: {
                return new TopThreeProductsAnalyzer();
            }
            case 2: {
                return new TopThreeProductAnalyzerByOccurence();
            }
            case 3: {
                return new TopThreeCustomersAnalyzer();
            }
            case 4: {
                return new TopThreeSalesPersonAnalyzer();
            }
            case 5: {
                return new TotalRevenueAnalyzer();
            }
            case EXIT_CASE: {
                System.out.println("***Thank you!***");
                return null;
            }
            default: {
                System.out.println("***Invalid Option Selected!***");
                return null;
            }
        }

    }
}
