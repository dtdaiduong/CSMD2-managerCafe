package productNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    //public ArrayList<Product> productList;
    private final List<Product> products = new ArrayList<>();

    public ProductManager() {
        //  ArrayList<Product> productList = new ArrayList<>();
        //  this.products = new ArrayList<>();

    }

    // kiểm tra xem có sản phẩm trong list chưa?
    // public boolean isThereAnyProductsOnTheList(Product product) {
    public boolean exist(int id) {
        if (!products.isEmpty()) {
            for (Product product : products) {
                if (product.getId() == id)
                    return true;
            }
        }
        return false;
    }

    // kiểm tra id sản phẩm
//    public boolean isIdInProductList(int id) {
//        if (!products.isEmpty()) {
//            for (Product products : products) {
//                if (products.getId() == id)
//                    return true;
//            }
//        }
//        return false;
//    }


    // kiểm tra xem tên có nằm trong danh sách chưa?
    public boolean isNameAProductList(String name) {
        if (!products.isEmpty()) {
            for (Product products : products) {
                if (products.getName().equalsIgnoreCase(name))
                    return true;
            }
        }
        return false;
    }

    public void add(int id, String name, double price) {
        Product newProduct = new Product(id, name, price);
        products.add(newProduct);
    }

    public Product getById(int id){
        for (Product product: products){
            if (product.getId()==id)
                return product;
        }
        return null;
    }

//    public void update() {
//        if (products.isEmpty()) {
//            System.out.println("There are no product in the list ");
//        } else {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Product id need edit ");
//            int id = input.nextInt();
//            if (exist(id)) {
//                for (Product product : products) {
//                    if (product.getId() == id) {
//
//                    }
//                }
//            }
//        }
//    }

//    public void findProductInProductWithName() {
//        if (products.isEmpty()) {
//            System.out.println("There are no product in the list");
//        } else {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Product need find : ");
//            String name = sc.nextLine();
//            if (isNameAProductList(name)) {
//                for (Product product : products) {
//                    if (product.getName().equalsIgnoreCase(name)) {
//                        System.out.println(product);
//                    } else {
//                        System.out.println("Not  have");
//                    }
//                }
//            }
//        }
//    }
//
//    public void deleteProductInProductWithId() {
//        if (products.isEmpty()) {
//            System.out.println("There are no product in the list! ");
//        } else {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Product id need remove ");
//            int id = input.nextInt();
//            if (isIdInProductList(id)) {
//                for (Product product : products) {
//                    if (product.getId() == id) {
//                        System.out.println("Product remove is : " + product.toString());
//                        products.remove(id);
//                    }
//                }
//            } else {
//                System.out.println("Id have not in product list ");
//            }
//        }
//    }
//
    public void displayProduct() {
        if (products.isEmpty()) {
            System.out.println("There are no product in the list");
        } else {
            int i = 1;
            for (Product product : products) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }
//
//    public void sortPriceAscending() {
//        if (products.isEmpty()) {
//            System.out.println("There are no product in the list! ");
//        } else {
//            // PriceAscendingComparator priceAscendingComparator = new PriceAscendingComparator();
//            //Collections.sort(products, priceAscendingComparator);
//            PriceSortASC priceSortASC = new PriceSortASC();
//            products.sort(priceSortASC);
//            int i = 1;
//            for (Product product : products) {
//                System.out.println(i + ". " + product.toString());
//                i++;
//            }
//        }
//    }
//
//    public void sortPriceDecrease() {
//        if (products.isEmpty()) {
//            System.out.println("There are no products in the list !");
//        } else {
//            // PriceDereaseComparator priceDereaseComparator = new PriceDereaseComparator();
//            //  Collections.sort(products, priceDereaseComparator);
//            PriceSortDESC priceSortDESC = new PriceSortDESC();
//            products.sort(priceSortDESC);
//            int i = 1;
//            for (Product product : products) {
//                System.out.println(i + ". " + product.toString());
//            }
//        }
//    }

}
