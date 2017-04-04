package hurtownie.danych;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_RATE_CRITERION")
public class DimRateCriterion {
	@Id
	@GeneratedValue
	@Column(name = "RATE_CRITERION_KEY")
	private long id;
	
	@Column(name = "CRITERION_NAME")
	private String criterionName;
	
	@Column(name = "CRITERION_TYPE_NAME")
	private String criterionTypeName;
	
	@Column(name = "CRITERION_VALUE")
	private int criterionValue;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCriterionName() {
		return criterionName;
	}

	public void setCriterionName(String criterionName) {
		this.criterionName = criterionName;
	}

	public String getCriterionTypeName() {
		return criterionTypeName;
	}

	public void setCriterionTypeName(String criterionTypeName) {
		this.criterionTypeName = criterionTypeName;
	}

	public int getCriterionValue() {
		return criterionValue;
	}

	public void setCriterionValue(int criterionValue) {
		this.criterionValue = criterionValue;
	}

}
