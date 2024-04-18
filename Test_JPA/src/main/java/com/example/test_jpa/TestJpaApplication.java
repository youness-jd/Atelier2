package com.example.test_jpa;

import com.example.test_jpa.entities.Product;
import com.example.test_jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TestJpaApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository ;

	public static void main(String[] args) {
		SpringApplication.run(TestJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//  productRepository.save(new Product(null,"product 1",4200,3));
		// productRepository.save(new Product(null,"product 2",8200,2));
		//productRepository.save(new Product(null,"product 3",9800,1));
		List<Product> products =  productRepository.findAll();
		products.forEach(p->
				System.out.println(p.getName()));
		System.out.println("*********************");
		Product product=productRepository.findById(Long.valueOf(1)).get();
		System.out.println(product.toString());
		System.out.println("*********************");

		List<Product> c =  productRepository.findByNameContains("1");
		c.forEach(p->
		{
			System.out.println(p.toString());
		});

		System.out.println("*******************");
		List<Product> d =  productRepository.search("%1%");
		d.forEach(p->
		{
			System.out.println(p.toString());
		});

		System.out.println("*********************");
		List<Product> l =  productRepository.findByPriceGreaterThan(5000);
		l.forEach(p->
		{
			System.out.println(p.toString());
		});


		System.out.println("*********************");
		List<Product> m =  productRepository.searchByPrice(5000.00);
		m.forEach(p->
		{
			System.out.println(p.toString());
		});


	}
}