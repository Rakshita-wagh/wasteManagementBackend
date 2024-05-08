// ProductController.java
package com.wasteProj.wasteManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        List<ProductModel> products = productRepository.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<ProductModel> addProduct(@RequestParam("image") MultipartFile file,
                                                   @RequestParam("name") String name,
                                                   @RequestParam("price") double price,
                                                   @RequestParam("quantity") int quantity) {
        try {
            ProductModel product = new ProductModel(name, price, quantity, file.getBytes());
            ProductModel newProduct = productRepository.save(product);

            // Fetch all products including the newly added one
            List<ProductModel> products = productRepository.findAll();

            return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}