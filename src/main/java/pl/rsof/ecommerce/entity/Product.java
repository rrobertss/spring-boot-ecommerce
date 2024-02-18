/*
 *  Company: RS
 *  Project: spring-boot-ecommerce
 *  Created: 24 sty 2023  17:10:49
 *  Author:  RS 		
 */
package pl.rsof.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * <p>Produkt</p><p>24 sty 2023</p>
 * @author RS
 *
 */
@Entity
@Table(name = "product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "sku")
	private String sku;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	@Column(name = "date_created")
	@CreationTimestamp
	private Date dateCreated;
	@Column(name = "last_updated")
	@UpdateTimestamp
	private Date dateUpdated;
	@ManyToOne
	@JoinColumn(name = "category_id" ,nullable = false)
	private ProductCategory category;
	
	
}
