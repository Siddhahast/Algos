package interviews.flipkart.sellingprice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 01/01/17.
 */
public class StoreManager {

    private ProductManager productManager;
    private Map<String, List<String>> userProductsMap;

    public StoreManager(){
        productManager = new ProductManager();
        userProductsMap = new HashMap<String , List<String>>();
    }

    public void addProduct(String product){
        productManager.addProduct(product);
    }

    public void purchase(String user, String product){
        Product prod = productManager.getProduct(product);
        if(userProductsMap.get(user)==null){
            List<String> productsList = new ArrayList<String>();
            productsList.add(product);
            userProductsMap.put(user, productsList);
            productManager.purchaseProduct(product);
        } else{
            List<String> productsList = userProductsMap.get(user);
            if(!productsList.contains(product)){
                productManager.purchaseProduct(product);
            }
            productsList.add(product);
            userProductsMap.put(user, productsList);
        }
    }

    public void returnProduct(String user, String product){
        List<String> productsList = userProductsMap.get(user);
        productsList.remove(product);
        userProductsMap.put(user, productsList);
        productManager.returnProduct(product);
    }

    public void blackListUser(String user){
        List<String> products = userProductsMap.get(user);
        products = null;
    }

    public void displayBestSellingProduct(){
        Product p = productManager.getBestSellingProduct();
        System.out.println(p.name);
    }

}
