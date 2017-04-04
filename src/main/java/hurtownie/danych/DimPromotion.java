package hurtownie.danych;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_PROMOTION")
public class DimPromotion {
	@Id
	@GeneratedValue
	@Column(name = "PROMOTION_KEY")
	private long id;

	@Column(name = "PROMOTION_NAME")
	private String promotionName;
	
	@Column(name = "PROMOTION_TYPE_NAME")
	private String promotionTypeName;
	
	@Column(name = "DISCOUNT_PCT")
	private int discountPct;
	
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

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getPromotionTypeName() {
		return promotionTypeName;
	}

	public void setPromotionTypeName(String promotionTypeName) {
		this.promotionTypeName = promotionTypeName;
	}

	public int getDiscountPct() {
		return discountPct;
	}

	public void setDiscountPct(int discountPct) {
		this.discountPct = discountPct;
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
