/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 22 lut 2024  22:02:41
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import pl.rsof.ecommerce.entity.State;

/**
 * <p>Obsługa województw, stanów, prowincji, itp.</p><p>22 lut 2024</p>
 * @author RS
 *
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer>{
	
	List<State>findByCountryCode(@Param("code") String code);
}
