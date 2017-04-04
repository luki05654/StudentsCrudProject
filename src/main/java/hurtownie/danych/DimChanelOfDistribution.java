package hurtownie.danych;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_CHANNEL_OF_DISTRIBUTION")
public class DimChanelOfDistribution {
	@Id
	@GeneratedValue
	@Column(name = "CHANNEL_OF_DISTRIBUTION_KEY")
	private long id;

	@Column(name = "DEVICE_NAME")
	private String deviceName;
	
	@Column(name = "DEVICE_TYPE_NAME")
	private String deviceTypeName;
	
	@Column(name = "CHANNEL_NAME")
	private String chanelName;
	
	@Column(name = "CHANNEL_TYPE")
	private String chanelType;

	@Column(name = "CHANNEL_TYPE_GROUP")
	private String chanelTypeGroup;	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getChanelName() {
		return chanelName;
	}

	public void setChanelName(String chanelName) {
		this.chanelName = chanelName;
	}

	public String getChanelType() {
		return chanelType;
	}

	public void setChanelType(String chanelType) {
		this.chanelType = chanelType;
	}

	public String getDeviceTypeName() {
		return deviceTypeName;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getChanelTypeGroup() {
		return chanelTypeGroup;
	}

	public void setChanelTypeGroup(String chanelTypeGroup) {
		this.chanelTypeGroup = chanelTypeGroup;
	}

}
