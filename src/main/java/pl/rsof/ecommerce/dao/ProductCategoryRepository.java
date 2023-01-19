/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 19 sty 2023  19:52:08
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.rsof.ecommerce.entity.ProductCategory;

/**
 * <p></p><p>19 sty 2023</p>
 * @author RS
 *
 */
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

	// productCategory - name of JSON entry
}
