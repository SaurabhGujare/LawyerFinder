package assignment_4.analytics;

import assignment_4.entities.Item;
import assignment_4.entities.Product;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class AnalysisHelper {

    public static int getProfitGenerated(Item item, Product product) {
        return item.getQuantity() * (item.getSalesPrice() - product.getMin());
    }

}
