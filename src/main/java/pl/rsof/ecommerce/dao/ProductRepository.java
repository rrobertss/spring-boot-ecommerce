/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 24 sty 2023  21:36:30
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import pl.rsof.ecommerce.entity.Product;

/**
 * <p></p><p>24 sty 2023</p>
 * @author RS
 *
 */
@CrossOrigin("http://localhost:4200") // zezwala na kontakt z przegladarka na porcie 4200, pod podanym adresem
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	Page<Product>findByCategoryId(@Param("id") Long id, Pageable pageable);
	
	Page<Product>findByNameContaining(@Param("name") String name, Pageable page);
		
	
}
