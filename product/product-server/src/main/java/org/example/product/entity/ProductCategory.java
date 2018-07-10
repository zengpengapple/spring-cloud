package org.example.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.Date;
@Entity
@Table(name="product_category")
@Data
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int categoryId;

	@Column(name="category_name")
	private String categoryName;

	@Column(name="category_type")
	private int categoryType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	public ProductCategory() {
	}

	

}