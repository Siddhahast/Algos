package interviews.flipkart.sellingprice;

import java.util.*;

/**
 * Created by siddhahastmohapatra on 01/01/17.
 */
public class ProductManager {

    Map<String, Product> map ;
    List<Product> products;

    public ProductManager(){
        map = new HashMap<String, Product>();
        products = new ArrayList<Product>();
    }

    public void addProduct(String product){
        if(map.get(product)==null){
            Product prod = new Product(product);
            map.put(product, prod);
            products.add(prod);
        }
    }

    public boolean isProductAvailable(String product){
        return map.get(product)!=null;
    }

    public Product getProduct(String productName){
        return map.get(productName);
    }

    public void purchaseProduct(String productName){
        map.get(productName).frequency++;
    }

    public void returnProduct(String productName){
        map.get(productName).frequency--;
    }

    public Product getBestSellingProduct(){
        Collections.sort(products);
        return products.get(0);
    }

}
