package com.anarbek.shop.web.beans;

import java.util.List;

import com.anarbek.shop.dao.domain.entity.CharacteristicValue;

public class CharacteristicFilterBean {

	private List<CharacteristicValue> characteristicValues;

	public List<CharacteristicValue> getCharacteristicValues() {
		return characteristicValues;
	}

	public void setCharacteristicValues(List<CharacteristicValue> characteristicValues) {
		this.characteristicValues = characteristicValues;
	}

}
