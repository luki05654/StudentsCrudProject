package hurtownie.danych;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_USER")
public class DimUser {
	@Id
	@GeneratedValue
	@Column(name = "USER_KEY")
	private long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "STREET_NUMBER")
	private String streetNumber;

	@Column(name = "STREET")
	private String street;

	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@Column(name = "AGE")
	private int age;

	@Column(name = "USER_TYPE_NAME")
	private String userTypeName;

	@Column(name = "BUSINESS_KEY")
	private long businessKey;

	@Column(name = "SUROGATE_KEY")
	private String surogateKey;

	@Column(name = "IS_CURRENT")
	private boolean isCurrent;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "TOTAL_CHILDREN")
	private int totalChildren;

	@Column(name = "JOB_POSITION")
	private String jobPosition;

	@Column(name = "OCCUPATION_NAME")
	private String occupationName;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;

	public long getId() {
		return id;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String countryName) {
		this.country = countryName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String cityName) {
		this.city = cityName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String streetName) {
		this.street = streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public long getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(long businessKey) {
		this.businessKey = businessKey;
	}

	public String getSurogateKey() {
		return surogateKey;
	}

	public void setSurogateKey(String surogateKey) {
		this.surogateKey = surogateKey;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTotalChildren() {
		return totalChildren;
	}

	public void setTotalChildren(int totalChildren) {
		this.totalChildren = totalChildren;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
