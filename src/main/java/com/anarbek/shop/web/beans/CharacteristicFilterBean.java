package com.anarbek.shop.web.beans;

import java.util.List;

import com.anarbek.shop.dao.domain.entity.ProductCharacteristicValue;

public class CharacteristicFilterBean {

	private List<ProductCharacteristicValue> characteristicValues;

	public List<ProductCharacteristicValue> getCharacteristicValues() {
		return characteristicValues;
	}

	public void setCharacteristicValues(List<ProductCharacteristicValue> characteristicValues) {
		this.characteristicValues = characteristicValues;
	}

}
