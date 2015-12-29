package com.anarbek.shop.dao.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.anarbek.shop.dao.domain.types.СharacteristicType;

@Entity
public class Сharacteristic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 512)
	private String title;

	@Column(length = 4000)
	private String description;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MEASUREMENT_ID")
	private Measurement measurement;

	@Enumerated(EnumType.STRING)
	private СharacteristicType сharacteristicType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Measurement getMeasurement() {
		return measurement;
	}

	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}

	public СharacteristicType getСharacteristicType() {
		return сharacteristicType;
	}

	public void setСharacteristicType(СharacteristicType сharacteristicType) {
		this.сharacteristicType = сharacteristicType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((measurement == null) ? 0 : measurement.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((сharacteristicType == null) ? 0 : сharacteristicType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Сharacteristic other = (Сharacteristic) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (measurement == null) {
			if (other.measurement != null)
				return false;
		} else if (!measurement.equals(other.measurement))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (сharacteristicType != other.сharacteristicType)
			return false;
		return true;
	}

}
