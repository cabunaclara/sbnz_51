package sbnz.cosmetology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProductLine {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@OneToMany
	private Product product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

	public ProductLine() {
		super();
	}

	public ProductLine(Long id, String name, String description, Product product) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.product = product;
	}
	
	
	
	
}
