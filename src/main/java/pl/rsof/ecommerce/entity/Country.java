/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 22 lut 2024  21:27:47
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>Kraj</p><p>22 lut 2024</p>
 * @author RS
 *
 */
@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "country")
	@JsonIgnore // ignoruje stanu w JSON, tylko kraje
	private List<State>states;
	
}
