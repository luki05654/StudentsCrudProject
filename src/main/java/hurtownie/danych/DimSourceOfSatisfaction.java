package hurtownie.danych;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_SOURCE_OF_SATISFACTION")
public class DimSourceOfSatisfaction {
	@Id
	@GeneratedValue
	@Column(name = "SOURCE_OF_SATISFACTION_KEY")
	private long id;

	@Column(name = "SOURCE_NAME")
	private String sourceName;

	@Column(name = "SOURCE_TYPE_NAME")
	private String sourceTypeName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceTypeName() {
		return sourceTypeName;
	}

	public void setSourceTypeName(String sourceTypeName) {
		this.sourceTypeName = sourceTypeName;
	}

}
