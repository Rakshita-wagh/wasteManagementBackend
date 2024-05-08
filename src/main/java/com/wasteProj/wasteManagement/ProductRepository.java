package com.wasteProj.wasteManagement;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductModel, String> {
    // Define a custom method to save a product
    ProductModel save(ProductModel product);
}
