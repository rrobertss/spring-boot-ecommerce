/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 24 sty 2023  21:37:29
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import pl.rsof.ecommerce.entity.ProductCategory;

/**
 * <p></p><p>24 sty 2023</p>
 * @author RS
 *
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

	// productCategory - name of JSON entry
	
	
	
	
}
