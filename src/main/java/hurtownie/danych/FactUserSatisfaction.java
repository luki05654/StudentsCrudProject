package hurtownie.danych;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACT_USER_SATISFACTION")
public class FactUserSatisfaction {
	@Id
	@GeneratedValue
	@Column(name = "USER_SATISFACTION_KEY")
	private long id;

	@OneToOne
	@JoinColumn(name = "CREATION_DATE_KEY")
	private DimDate date;

	@OneToOne
	@JoinColumn(name = "USER_KEY")
	private DimUser user;

	@OneToOne
	@JoinColumn(name = "SOURCE_OF_SATISFACTION_KEY")
	private DimSourceOfSatisfaction sourceOfSatisfaction;
	
	@Column(name = "SATISFACTION_VALUE")
	private double satisfactionValue;
	
	@Column(name = "MOBILE_DEVICES_COUNT")
	private long modileDevicesCount;
	
	@Column(name = "STACIONARY_DEVICES_COUNT")
	private long stationaryDevicesCount;
	
	@Column(name = "RATE_OF_USER")
	private double rateOfUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSatisfactionValue() {
		return satisfactionValue;
	}

	public void setSatisfactionValue(double satisfactionValue) {
		this.satisfactionValue = satisfactionValue;
	}

	public DimDate getDate() {
		return date;
	}

	public void setDate(DimDate date) {
		this.date = date;
	}

	public DimUser getUser() {
		return user;
	}

	public void setUser(DimUser user) {
		this.user = user;
	}

	public DimSourceOfSatisfaction getSourceOfSatisfaction() {
		return sourceOfSatisfaction;
	}

	public void setSourceOfSatisfaction(DimSourceOfSatisfaction sourceOfSatisfaction) {
		this.sourceOfSatisfaction = sourceOfSatisfaction;
	}

	public long getModileDevicesCount() {
		return modileDevicesCount;
	}

	public void setModileDevicesCount(long modileDevicesCount) {
		this.modileDevicesCount = modileDevicesCount;
	}

	public long getStationaryDevicesCount() {
		return stationaryDevicesCount;
	}

	public void setStationaryDevicesCount(long stationaryDevicesCount) {
		this.stationaryDevicesCount = stationaryDevicesCount;
	}

	public double getRateOfUser() {
		return rateOfUser;
	}

	public void setRateOfUser(double rateOfUser) {
		this.rateOfUser = rateOfUser;
	}

}
