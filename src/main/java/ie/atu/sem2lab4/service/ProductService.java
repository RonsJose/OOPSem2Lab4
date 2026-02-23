package ie.atu.sem2lab4.service;

import ie.atu.sem2lab4.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>(); //List to store the data
    private long nextId = 1;

    public Product addProduct(Product product) { //Method to add products
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return products;
    } // Method to return list of all products
}
