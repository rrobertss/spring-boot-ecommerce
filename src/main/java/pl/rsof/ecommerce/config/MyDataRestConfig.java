/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 19 sty 2023  20:30:19
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import pl.rsof.ecommerce.entity.Product;
import pl.rsof.ecommerce.entity.ProductCategory;

/**
 * <p>Disable POST, PUT, DELETE</p><p>19 sty 2023</p>
 * @author RS
 *
 */
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		HttpMethod[] theUnsupportedActions = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
		
		//disable Http methods for Products
		config.getExposureConfiguration()
		.forDomainType(Product.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		//disable Http methods for ProductCategory
		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
	}
	
	
}
