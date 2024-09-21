package com.dsd.spring_data_jpa_ex;

import com.dsd.spring_data_jpa_ex.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


//    @Query("select p from Product p where p.name = ?1")
    List<Product> findByName(String name);
    List<Product> findByPriceGreaterThan(int price);

}
