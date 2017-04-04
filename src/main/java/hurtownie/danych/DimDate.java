package hurtownie.danych;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_DATE")
public class DimDate {
	@Id
	@GeneratedValue
	@Column(name = "DATE_KEY")
	private long id;
	
	@Column(name = "FULL_DATE")	
	private Date fullDate;
	
	@Column(name = "CALLENDAR_YEAR")
	private String callendarYear;
	
	@Column(name = "CALLENDAR_YEAR_NAME")
	private String callendarYearName;
	
	@Column(name = "CALLENDAR_QUARTER")
	private String callendarQuarter;
	
	@Column(name = "CALLENDAR_QUARTER_NAME")
	private String callendarQuarterName;
	
	@Column(name = "CALLENDAR_MONTH")
	private String callendarMonth;
	
	@Column(name = "CALLENDAR_MONTH_NAME")
	private String callendarMonthName;
	
	@Column(name = "WEEK_NUMBER_OF_YEAR")
	private int weekNumberOfYear;
	
	@Column(name = "WEEK_OF_YEAR_NAME")
	private String weekOfYearName;
	
	@Column(name = "DAY_NUMBER_OF_MONTH")
	private int dayNumberOfMonth;
	
	@Column(name = "DAY_NUMBER_OF_YEAR")
	private int dayNumberOfYear;
	
	@Column(name = "DAY_NUMBER_OF_WEEK")
	private int dayNumberOfWeek;
	
	@Column(name = "DAY_NAME")
	private String dayName;
	
	@Column(name = "MONTH_NUMBER_OF_YEAR")
	private int monthNumberOfYear;
	
	@Column(name = "HOUR_NUMBER_OF_YEAR")
	private int hourNumberOfDay;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFullDate() {
		return fullDate;
	}

	public void setFullDate(Date fullDate) {
		this.fullDate = fullDate;
	}

	public String getCallendarYear() {
		return callendarYear;
	}

	public void setCallendarYear(String callendarYear) {
		this.callendarYear = callendarYear;
	}

	public String getCallendarYearName() {
		return callendarYearName;
	}

	public void setCallendarYearName(String callendarYearName) {
		this.callendarYearName = callendarYearName;
	}

	public String getCallendarQuarter() {
		return callendarQuarter;
	}

	public void setCallendarQuarter(String callendarQuarter) {
		this.callendarQuarter = callendarQuarter;
	}

	public String getCallendarQuarterName() {
		return callendarQuarterName;
	}

	public void setCallendarQuarterName(String callendarQuarterName) {
		this.callendarQuarterName = callendarQuarterName;
	}

	public String getCallendarMonth() {
		return callendarMonth;
	}

	public void setCallendarMonth(String callendarMonth) {
		this.callendarMonth = callendarMonth;
	}

	public String getCallendarMonthName() {
		return callendarMonthName;
	}

	public void setCallendarMonthName(String callendarMonthName) {
		this.callendarMonthName = callendarMonthName;
	}

	public int getWeekNumberOfYear() {
		return weekNumberOfYear;
	}

	public void setWeekNumberOfYear(int weekNumberOfYear) {
		this.weekNumberOfYear = weekNumberOfYear;
	}

	public String getWeekOfYearName() {
		return weekOfYearName;
	}

	public void setWeekOfYearName(String weekName) {
		this.weekOfYearName = weekName;
	}

	public int getDayNumberOfMonth() {
		return dayNumberOfMonth;
	}

	public void setDayNumberOfMonth(int dayNumberOfMonth) {
		this.dayNumberOfMonth = dayNumberOfMonth;
	}

	public int getDayNumberOfYear() {
		return dayNumberOfYear;
	}

	public void setDayNumberOfYear(int dayNumberOfYear) {
		this.dayNumberOfYear = dayNumberOfYear;
	}

	public int getDayNumberOfWeek() {
		return dayNumberOfWeek;
	}

	public void setDayNumberOfWeek(int dayNumberOfWeek) {
		this.dayNumberOfWeek = dayNumberOfWeek;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public int getMonthNumberOfYear() {
		return monthNumberOfYear;
	}

	public void setMonthNumberOfYear(int monthNumberOfYear) {
		this.monthNumberOfYear = monthNumberOfYear;
	}

	public int getHourNumberOfDay() {
		return hourNumberOfDay;
	}

	public void setHourNumberOfDay(int hourNumberOfDay) {
		this.hourNumberOfDay = hourNumberOfDay;
	}

}
