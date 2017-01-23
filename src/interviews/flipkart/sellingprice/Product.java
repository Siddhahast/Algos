package interviews.flipkart.sellingprice;

/**
 * Created by siddhahastmohapatra on 01/01/17.
 */
public class Product<T> implements Comparable<Product<T>> {

    T name;
    int frequency ;

    public Product(T name){
        this.name = name;
        this.frequency = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Product o) {
        if(this.frequency>o.frequency){
            return -1;
        } else if(this.frequency < o.frequency){
            return 1;
        } else{
            return 0;
        }
    }
}
