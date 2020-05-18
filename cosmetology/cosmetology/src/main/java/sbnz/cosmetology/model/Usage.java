package sbnz.cosmetology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	@Column
	@Enumerated(EnumType.STRING)
	private UsageTime usageTime;
	
	@ManyToOne
	private UsageFrequency usageFrequency;
	
	private String description;

	public UsageTime getUsageTime() {
		return usageTime;
	}

	public void setUsageTime(UsageTime usageTime) {
		this.usageTime = usageTime;
	}

	public UsageFrequency getUsageFrequency() {
		return usageFrequency;
	}

	public void setUsageFrequency(UsageFrequency usageFrequency) {
		this.usageFrequency = usageFrequency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Usage() {
		super();
	}

	public Usage(UsageTime usageTime, UsageFrequency usageFrequency, String description) {
		super();
		this.usageTime = usageTime;
		this.usageFrequency = usageFrequency;
		this.description = description;
	}
	
	

}
