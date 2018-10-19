package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class ProductDirectory {
    
    private List<Product> productList;
    
    public ProductDirectory(){
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    
    
}
