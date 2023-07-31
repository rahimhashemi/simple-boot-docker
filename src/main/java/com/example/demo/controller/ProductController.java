package com.example.demo.controller;

import com.example.demo.datamodel.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/", ""})
    public String checkingApp() {
        return "application is up and running!";
    }

    @GetMapping("/all")
    public List<Product> getProducts(){
        return productService.getProductList();
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    //todo add delete and edit request
}
