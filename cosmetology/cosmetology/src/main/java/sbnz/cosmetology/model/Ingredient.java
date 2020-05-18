package sbnz.cosmetology.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ingredient {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column
	public String name;
	
	@Column
	public String description;
	
	@Column
	public int harmfulness;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    @JsonIgnore
    private IngredientsGroup ingredientsGroup;

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

	public int getHarmfulness() {
		return harmfulness;
	}

	public void setHarmfulness(int harmfulness) {
		this.harmfulness = harmfulness;
	}
	
	

	public IngredientsGroup getIngredientsGroup() {
		return ingredientsGroup;
	}

	public void setIngredientsGroup(IngredientsGroup ingredientsGroup) {
		this.ingredientsGroup = ingredientsGroup;
	}

	public Ingredient() {
		super();
	}

	public Ingredient(Long id, String name, String description, int harmfulness, IngredientsGroup ingredientsGroup) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.harmfulness = harmfulness;
		this.ingredientsGroup = ingredientsGroup;
	}

	
	
	
}
