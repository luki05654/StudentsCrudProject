package hurtownie.danych;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACT_TRANSACTION_QUALITY")
public class FactTransactionQuality {
	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_QUALITY_KEY")
	private long id;

	@OneToMany
	@JoinColumn(name = "RATE_CRITERION_KEY")
	private List<DimRateCriterion> rateCriterions;

	@OneToOne
	@JoinColumn(name = "RATE_DATE_KEY")
	private DimDate rateDate;

	@OneToOne
	@JoinColumn(name = "USER_KEY")
	private DimUser user;

	@Column(name = "AVERAGE_RATE")
	private double averageRate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<DimRateCriterion> getRateCriterions() {
		return rateCriterions;
	}

	public void setRateCriterions(List<DimRateCriterion> rateCriterions) {
		this.rateCriterions = rateCriterions;
	}

	public DimUser getUser() {
		return user;
	}

	public void setUser(DimUser user) {
		this.user = user;
	}

	public DimDate getRateDate() {
		return rateDate;
	}

	public void setRateDate(DimDate rateDate) {
		this.rateDate = rateDate;
	}

	public double getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(double averageRate) {
		this.averageRate = averageRate;
	}

}
