package productNew;

import java.util.Scanner;

public class ProductView {
    ProductManager productManager = new ProductManager();
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("Menu product Manager ");
        System.out.println("1. Add Product ");
        System.out.println("2. Edit Product with id ");
        System.out.println("3. find product with name ");
        System.out.println("4. Delete product with id ");
        System.out.println("5. Display product list ");
        System.out.println("6. Sort in ascending order of price");
        System.out.println("7. Sort in decrease order of price");
        System.out.println("8. Exit progame");
        System.out.println("------------------------");
    }
    public void menuManager() {
        while (true) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    productManager.displayProduct();
                    break;
                case 2:
                    updateManager();
                    break;
                case 3:

//                    findProductInProductWithName();
                    break;
                case 4:
//                    deleteProductInProductWithId();
                    break;
                case 5:
//                    displayProduct();
                    productManager.displayProduct();
                    break;
                case 6:
//                    sortPriceAscending();
                    break;
                case 7:
//                    sortPriceDecrease();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

    public void addProduct() {
        int id;
        String name;
        double price;
        // nhập name, nếu name nhập vào đã có thì phải nhập lại
//        do {
//            System.out.println("Product name: ");
//            id = ;
//            if (productManager.exist(id))
//                System.out.println("Product have had in the product list");
//        } while (productManager.exist(name));

        // nhập vào id, nếu id nằm trong list thì phải nhập lại
        do {
            System.out.print("Product id: ");
            id = Integer.parseInt(scanner.nextLine());
            if (productManager.exist(id)) {
                System.out.println("Id had in the product list");
            }
        } while (productManager.exist(id));

        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Product price : ");
        price = Double.parseDouble(scanner.nextLine());

        productManager.add(id, name, price);
    }

    public void updateManager(){
        System.out.println("Nhap ID can sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!productManager.exist(id)){
            System.out.println("ID khong ton tai!");
        }else {
            Product product= productManager.getById(id);

            System.out.println("lua chon chuc nang");
            do {
                System.out.println("Menu edit Product");
                System.out.println("1. Edit name product");
                System.out.println("2. Edit id product");
                System.out.println("3. Edit price Product");
                System.out.println("0. Exit");
                System.out.println("--------------------");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("New name: ");
                        String newName = scanner.nextLine();
                        product.setName(newName);
                        break;
                    case 2:
//                        System.out.print("New Id : ");
//                        int newID = sc.nextInt();
//                        product.setId(newID);
                        break;
                    case 3:
                        System.out.println("New Price : ");
                        int newPrice = scanner.nextInt();
                        product.setPrice(newPrice);
                        break;
                    case 0:
                        menuManager();
                        break;
                    default:
                        System.out.println("nhap cac chuc nang tren");
                        break;
                }
            } while (true);
        }
    }
}
