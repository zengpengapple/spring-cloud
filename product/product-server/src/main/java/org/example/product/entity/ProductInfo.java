package org.example.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the product_info database table.
 * 
 */
@Entity
@Table(name="product_info")
@Data
public class ProductInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="product_id")
	private String productId;

	@Column(name="category_type")
	private int categoryType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="product_description")
	private String productDescription;

	@Column(name="product_icon")
	private String productIcon;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_price")
	private BigDecimal productPrice;

	@Column(name="product_status")
	private Integer productStatus;

	@Column(name="product_stock")
	private Integer productStock;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	public ProductInfo() {
	}

	
}