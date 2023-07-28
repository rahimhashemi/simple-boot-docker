package com.example.demo.configuration;

import com.example.demo.datamodel.Product;
import com.example.demo.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {
    private ProductRepository productRepository;

    private final Logger log = LogManager.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Lenovo z500");
        laptop.setPrice(new BigDecimal("200.00"));
        laptop.setProductId(UUID.randomUUID());
        productRepository.save(laptop);

        log.info("Saved" + laptop.getName() + " - id: " + laptop.getId());

        Product usb = new Product();
        usb.setName("USB");
        usb.setDescription("SanDisk EF");
        usb.setPrice(new BigDecimal("15.00"));
        usb.setProductId(UUID.randomUUID());
        productRepository.save(usb);

        log.info("Saved" + usb.getName() + " - id: " + usb.getId());
    }
}
