package com.dsd.spring_data_jpa_ex;

import com.dsd.spring_data_jpa_ex.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);


	ProductRepo repo = context.getBean(ProductRepo.class);


//	Product p1 = context.getBean(Product.class);
	Product p2 = context.getBean(Product.class);
//	Product p3 = context.getBean(Product.class);

//	p1.setProductId(101);
//	p1.setName("Iphone 16");
//	p1.setPrice(79990);
//
	p2.setProductId(102);
	p2.setName("MacBook M2");
	p2.setPrice(89900);
//
//	p3.setProductId(103);
//	p3.setName("Apple Watch 5");
//	p3.setPrice(55000);
//
//	repo.save(p2);
//	repo.save(p3);

//		Optional<Product> s = repo.findById(103);
//
//		System.out.println(s.orElse(new Product()));
//
//		System.out.println(repo.findByName("Iphone 16"));


		repo.save(p2);

		System.out.println(repo.findByPriceGreaterThan(60000));

		repo.delete(p2);

		System.out.println(repo.findAll());


	}

}
