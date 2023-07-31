package com.example.demo.repository;

import com.example.demo.datamodel.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository underTest;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void itShouldSaveProduct() {
        //given
        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Lenovo z500");
        laptop.setPrice(new BigDecimal("200.00"));
        laptop.setProductId(UUID.randomUUID());
        //when
        Product saved = underTest.save(laptop);
        //then
        assertThat(saved.getName()).isEqualTo(laptop.getName());
        Optional<Product> optionalProduct = underTest.findById(saved.getId());
        assertThat(optionalProduct)
                .isPresent()
                .hasValueSatisfying(p->assertThat(p).isEqualToComparingFieldByField(laptop));
    }
}