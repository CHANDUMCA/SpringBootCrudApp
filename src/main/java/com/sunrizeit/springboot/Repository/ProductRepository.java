package com.sunrizeit.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunrizeit.springboot.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
