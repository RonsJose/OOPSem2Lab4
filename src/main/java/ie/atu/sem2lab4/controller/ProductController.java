package ie.atu.sem2lab4.controller;

import jakarta.validation.Valid;
import ie.atu.sem2lab4.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ie.atu.sem2lab4.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")//endpoint
public class ProductController {
    private final ProductService productService; //instance of service

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping//Post request to add a product to list
    public ResponseEntity<Product> addProduct(
        @Valid @RequestBody Product product) { //Does validation check in the body of the request

        Product saved = productService.addProduct(product); // New instance of product and adding it to the service list
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping//Get request to get all products
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
