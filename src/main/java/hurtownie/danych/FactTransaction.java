package hurtownie.danych;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACT_TRANSACTION")
public class FactTransaction {
	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_KAY")
	private long id;

	@Column(name = "TRANSACTION_KEY")
	private int transactionKey;

	@Column(name = "TRANSACTION_NUMBER")
	private String transactionNumber;

	@Column(name = "TRANSACTION_NAME")
	private String transactionName;

	@OneToOne
	@JoinColumn(name = "START_DATE_KEY")
	private DimDate startDate;

	@OneToOne
	@JoinColumn(name = "END_DATE_KEY")
	private DimDate endDate;

	@OneToOne
	@JoinColumn(name = "DECLARED_END_DATE_KEY")
	private DimDate deflaredEndDate;

	@Column(name = "TRANSACTION_VALUE")
	private double transactionValue;

	@OneToOne
	@JoinColumn(name = "CHANNEL_OF_DISTRIBUTION_KEY")
	private DimChanelOfDistribution chanelOfDistribution;

	@OneToOne
	@JoinColumn(name = "USER_KEY")
	private DimUser user;

	@OneToOne
	@JoinColumn(name = "PROMOTION_KEY")
	private DimPromotion promotion;

	@OneToOne
	@JoinColumn(name = "PRODUCT_KEY")
	private DimProduct product;

	@Column(name = "POSITION_COMMISSION")
	private double positionCommission;
	
	@Column(name = "BOLD_FONT_COMMISSION")
	private double boldFontCommission;
	
	@Column(name = "ADDITIONAL_PICTURES_COMMISSION")
	private double additionalPicturesCommission;
	
	@Column(name = "CREATION_COMMISSION")
	private double creationCommission;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public DimDate getStartDate() {
		return startDate;
	}

	public void setStartDate(DimDate startDate) {
		this.startDate = startDate;
	}

	public DimDate getEndDate() {
		return endDate;
	}

	public void setEndDate(DimDate endDate) {
		this.endDate = endDate;
	}

	public DimDate getDeflaredEndDate() {
		return deflaredEndDate;
	}

	public void setDeflaredEndDate(DimDate deflaredEndDate) {
		this.deflaredEndDate = deflaredEndDate;
	}

	public double getTransactionValue() {
		return transactionValue;
	}

	public void setTransactionValue(double transactionValue) {
		this.transactionValue = transactionValue;
	}

	public DimPromotion getPromotion() {
		return promotion;
	}

	public void setPromotion(DimPromotion promotion) {
		this.promotion = promotion;
	}

	public int getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(int transactionKey) {
		this.transactionKey = transactionKey;
	}

	public DimChanelOfDistribution getChanelOfDistribution() {
		return chanelOfDistribution;
	}

	public void setChanelOfDistribution(DimChanelOfDistribution chanelOfDistribution) {
		this.chanelOfDistribution = chanelOfDistribution;
	}

	public DimUser getUser() {
		return user;
	}

	public void setUser(DimUser user) {
		this.user = user;
	}

	public DimProduct getProduct() {
		return product;
	}

	public void setProduct(DimProduct product) {
		this.product = product;
	}

	public double getPositionCommission() {
		return positionCommission;
	}

	public void setPositionCommission(double positionCommission) {
		this.positionCommission = positionCommission;
	}

	public double getBoldFontCommission() {
		return boldFontCommission;
	}

	public void setBoldFontCommission(double boldFontCommission) {
		this.boldFontCommission = boldFontCommission;
	}

	public double getAdditionalPicturesCommission() {
		return additionalPicturesCommission;
	}

	public void setAdditionalPicturesCommission(double additionalPicturesCommission) {
		this.additionalPicturesCommission = additionalPicturesCommission;
	}

	public double getCreationCommission() {
		return creationCommission;
	}

	public void setCreationCommission(double creationCommission) {
		this.creationCommission = creationCommission;
	}

}
