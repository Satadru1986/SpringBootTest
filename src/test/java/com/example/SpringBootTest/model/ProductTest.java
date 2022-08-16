package com.example.SpringBootTest.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Product#Product(String)}
     *   <li>{@link Product#setName(String)}
     *   <li>{@link Product#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Product actualProduct = new Product("Name");
        actualProduct.setName("Name");
        assertEquals("Name", actualProduct.getName());
    }
}

