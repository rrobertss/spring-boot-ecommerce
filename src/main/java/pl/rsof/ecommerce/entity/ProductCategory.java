/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 18 sty 2023  22:20:59
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>Kategoria produktów</p><p>18 sty 2023</p>
 * @author RS
 *
 */
@Entity
@Table(name = "product_category")
//@Data - known bug with reletionship oneToMany or ManyToOne
@Getter
@Setter
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Product>products;
	
}
