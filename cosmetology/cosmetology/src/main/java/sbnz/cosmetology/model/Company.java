package sbnz.cosmetology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Company() {
		super();
	}

	public Company(String name) {
		super();
		this.name = name;
	}
	
	
}
