package com.example.demo.service;

import com.example.demo.datamodel.Product;
import com.example.demo.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final Logger log = LogManager.getLogger(ProductService.class);

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList(){
        log.info("calling getProductList...");
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        Product saved = productRepository.save(product);
        log.info("product saved : " + saved);
    }
}
