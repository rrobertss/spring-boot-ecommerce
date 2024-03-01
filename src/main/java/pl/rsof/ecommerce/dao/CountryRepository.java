/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 22 lut 2024  21:50:54
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import pl.rsof.ecommerce.entity.Country;

/**
 * <p>Obsługa krajów</p><p>22 lut 2024</p>
 * @author RS
 *
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries") // endpoint
public interface CountryRepository extends JpaRepository<Country, Integer>{

	
}
