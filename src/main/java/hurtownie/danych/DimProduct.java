package hurtownie.danych;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_PRODUCT")
public class DimProduct {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_KEY")
	private long id;

	@Column(name = "PRODUCT_CATEGORY")
	private String productCategory;

	@Column(name = "PRODUCT_SUBCATEGORY")
	private String productSubCategory;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_WEIGHT")
	private double productWeight;

	@Column(name = "PRODUCT_COLOR_NAME")
	private String productColorName;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "COMMISION_PCT")
	private int commissionPct;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "BUSINESS_KEY")
	private long businessKey;

	@Column(name = "SUROGATE_KEY")
	private String surogateKey;

	@Column(name = "IS_CURRENT")
	private boolean isCurrent;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductColorName() {
		return productColorName;
	}

	public void setProductColorName(String productColorName) {
		this.productColorName = productColorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(int commissionPct) {
		this.commissionPct = commissionPct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
