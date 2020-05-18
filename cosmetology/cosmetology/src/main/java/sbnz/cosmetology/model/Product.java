package sbnz.cosmetology.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Product {

	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@OneToOne
	private Usage usage;
	
	@Column
	@Enumerated(EnumType.STRING)
	private ProductType productType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductLine line;
	
	@OneToMany
	private Ingredient ingredients;

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

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductLine getLine() {
		return line;
	}

	public void setLine(ProductLine line) {
		this.line = line;
	}

	public Ingredient getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredient ingredients) {
		this.ingredients = ingredients;
	}

	public Product() {
		super();
	}
	
	
}
