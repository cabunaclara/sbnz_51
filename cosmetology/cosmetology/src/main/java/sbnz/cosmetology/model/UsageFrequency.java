package sbnz.cosmetology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsageFrequency {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	@Column
	@Enumerated(EnumType.STRING)
	private UsageFrequencyEnum usageFrequencyEnum;
	
	@Column
	@Enumerated(EnumType.STRING)
	private UsagePeriod usagePeriod;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsageFrequencyEnum getUsageFrequencyEnum() {
		return usageFrequencyEnum;
	}

	public void setUsageFrequencyEnum(UsageFrequencyEnum usageFrequencyEnum) {
		this.usageFrequencyEnum = usageFrequencyEnum;
	}

	public UsagePeriod getUsagePeriod() {
		return usagePeriod;
	}

	public void setUsagePeriod(UsagePeriod usagePeriod) {
		this.usagePeriod = usagePeriod;
	}

	public UsageFrequency() {
		super();
	}

	public UsageFrequency(UsageFrequencyEnum usageFrequencyEnum, UsagePeriod usagePeriod) {
		super();
		this.usageFrequencyEnum = usageFrequencyEnum;
		this.usagePeriod = usagePeriod;
	}
	
	
}
