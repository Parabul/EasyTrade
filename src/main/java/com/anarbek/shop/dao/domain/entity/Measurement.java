package com.anarbek.shop.dao.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.anarbek.shop.dao.domain.types.MeasurementPosition;

@Entity
public class Measurement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 512)
	private String title;

	@Column(length = 4000)
	private String description;

	private String value;

	@Enumerated(EnumType.STRING)
	private MeasurementPosition measurementPosition;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MeasurementPosition getMeasurementPosition() {
		return measurementPosition;
	}

	public void setMeasurementPosition(MeasurementPosition measurementPosition) {
		this.measurementPosition = measurementPosition;
	}

}
