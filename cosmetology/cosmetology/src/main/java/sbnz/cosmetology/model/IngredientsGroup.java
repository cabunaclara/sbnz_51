package sbnz.cosmetology.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class IngredientsGroup {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String purpose;
	
	@OneToMany(mappedBy = "ingredientGroup",
            cascade = CascadeType.ALL,
            orphanRemoval = false)
	private Ingredient ingredient;
	

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


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public Ingredient getIngredient() {
		return ingredient;
	}


	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}


	public IngredientsGroup() {
		super();
	}


	public IngredientsGroup(String name, String description, String purpose, Ingredient ingredient) {
		super();
		this.name = name;
		this.description = description;
		this.purpose = purpose;
		this.ingredient = ingredient;
	}
	
	
}
