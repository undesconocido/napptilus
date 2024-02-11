package org.test.napptilus.inbound.rest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class E2EFareControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Fare para 10:00 del día 14 del producto 35455 para la brand 1")
    void test1() throws Exception {
        mockMvc.perform(get("/v1/fares?productId=35455&brandId=1&applicationDate=2020-06-14T10:00:00"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                            "productId": "35455",
                            "brandId": "1",
                            "price": "35.50",
                            "currency": "EUR"
                        }
                        """
                ));
    }

    @Test
    @DisplayName("Fare para 16:00 del día 14 del producto 35455 para la brand 1")
    void test2() throws Exception {
        mockMvc.perform(get("/v1/fares?productId=35455&brandId=1&applicationDate=2020-06-14T16:00:00"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                            "productId": "35455",
                            "brandId": "1",
                            "price": "25.45",
                            "currency": "EUR"
                        }
                        """
                ));
    }

    @Test
    @DisplayName("Fare para 21:00 del día 14 del producto 35455 para la brand 1")
    void test3() throws Exception {
        mockMvc.perform(get("/v1/fares?productId=35455&brandId=1&applicationDate=2020-06-14T21:00:00"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                            "productId": "35455",
                            "brandId": "1",
                            "price": "35.50",
                            "currency": "EUR"
                        }
                        """
                ));
    }

    @Test
    @DisplayName("Fare para 10:00 del día 15 del producto 35455 para la brand 1")
    void test4() throws Exception {
        mockMvc.perform(get("/v1/fares?productId=35455&brandId=1&applicationDate=2020-06-15T10:00:00"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                            "productId": "35455",
                            "brandId": "1",
                            "price": "30.50",
                            "currency": "EUR"
                        }
                        """
                ));
    }

    @Test
    @DisplayName("Fare para 21:00 del día 16 del producto 35455 para la brand 1")
    void test5() throws Exception {
        mockMvc.perform(get("/v1/fares?productId=35455&brandId=1&applicationDate=2020-06-16T21:00:00"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                            "productId": "35455",
                            "brandId": "1",
                            "price": "38.95",
                            "currency": "EUR"
                        }
                        """
                ));
    }
}