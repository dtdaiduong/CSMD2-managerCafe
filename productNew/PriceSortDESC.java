package productNew;


import java.util.Comparator;

public class PriceSortDESC implements Comparator<Product> {
    @Override
    public int compare(Product productOne, Product productTwo) {
        return Double.compare(productTwo.getPrice(), productOne.getPrice());
    }
}
