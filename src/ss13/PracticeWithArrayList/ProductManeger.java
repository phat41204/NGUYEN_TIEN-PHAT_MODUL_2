package ss13.PracticeWithArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductManeger {
    private ArrayList<Product> productsList = new ArrayList<>();

    public ProductManeger() {
        productsList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void UpdateProducts(int id, String name, double price) {
        for (Product product : productsList) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                System.out.println("Product updated completed");
                return;
            }
        }
    }

    public void DeleteProduct(int id) {
        for (Product product : productsList) {
            if (product.getId() == id) {
                productsList.remove(product);
                System.out.println("Product deleted completed");
                return;
            }
        }
    }

    public void DisplayProducts() {
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    public void SearchProduct(String productName) {
        boolean found = false;
        for (Product product : productsList) {
            if (product.getName().equals(productName)) {
                System.out.println("Product found" + product);
                found = true;
                return;
            } else {
                System.out.println("Product not found" + product);
                return;
            }
        }
    }

    public void SortProductsToUp() {
        Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println("Sorted Products completed");
    }

    public  void sortProdcutsToDown(){
        Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        System.out.println("Sorted Products completed");
    }
}
