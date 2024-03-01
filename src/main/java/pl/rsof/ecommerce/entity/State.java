/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 22 lut 2024  21:28:04
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>Podział kraju - stany, województwa, prowincje, itp.</p><p>22 lut 2024</p>
 * @author RS
 *
 */
@Entity
@Table(name = "state")
@Getter
@Setter
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
}
