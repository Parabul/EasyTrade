package com.anarbek.shop.web.beans;

import java.util.List;

import com.anarbek.shop.dao.domain.entity.СharacteristicValue;

public class CharacteristicFilterBean {

	private List<СharacteristicValue> сharacteristicValues;

	public List<СharacteristicValue> getСharacteristicValues() {
		return сharacteristicValues;
	}

	public void setСharacteristicValues(List<СharacteristicValue> сharacteristicValues) {
		this.сharacteristicValues = сharacteristicValues;
	}

}
