/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 24 sty 2023  21:39:12
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import pl.rsof.ecommerce.entity.Product;
import pl.rsof.ecommerce.entity.ProductCategory;

/**
 * <p>Disable POST, PUT, DELETE</p><p>24 sty 2023</p>
 * @author RS
 *
 */
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	
	private EntityManager entityManager;
	
	
	@Autowired
	public MyDataRestConfig(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
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
		
		
		// internal helper method
		exposeIds(config);
	}
	
	
	private void exposeIds(RepositoryRestConfiguration config) {
		// expose entity ids
		
		Set<EntityType<?>>entities = entityManager.getMetamodel().getEntities();
		
		List<Class<?>>entityClasses = new ArrayList<>();
		
		for (EntityType<?> type : entities) {
			entityClasses.add(type.getJavaType());
		}
		
		Class<?>[] domainTypes = entityClasses.toArray(new Class[0]);
		
		
//		or 
//		Class<?>[] classes = entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new);
		
		
		config.exposeIdsFor(domainTypes);
	}
	
}
