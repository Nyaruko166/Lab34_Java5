package com.example.lab34.repository;

import com.example.lab34.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;


public interface IProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByProductNameContains(String keyword);

    List<Product> findByQuantityGreaterThan(Integer soLuong);

    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);
}
