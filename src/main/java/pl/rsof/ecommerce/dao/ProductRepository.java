/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 19 sty 2023  19:50:45
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.rsof.ecommerce.entity.Product;

/**
 * <p></p><p>19 sty 2023</p>
 * @author RS
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

}
