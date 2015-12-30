/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq.tables.records;


import com.anarbek.shop.dao.domain.jooq.tables.Characteristic;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacteristicRecord extends UpdatableRecordImpl<CharacteristicRecord> implements Record5<Long, String, String, String, Long> {

	private static final long serialVersionUID = 2027200519;

	/**
	 * Setter for <code>public.characteristic.id</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.characteristic.id</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>public.characteristic.characteristic_type</code>.
	 */
	public void setCharacteristicType(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.characteristic.characteristic_type</code>.
	 */
	public String getCharacteristicType() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.characteristic.description</code>.
	 */
	public void setDescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.characteristic.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.characteristic.title</code>.
	 */
	public void setTitle(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.characteristic.title</code>.
	 */
	public String getTitle() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.characteristic.measurement_id</code>.
	 */
	public void setMeasurementId(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.characteristic.measurement_id</code>.
	 */
	public Long getMeasurementId() {
		return (Long) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, String, String, String, Long> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, String, String, String, Long> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Characteristic.CHARACTERISTIC.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Characteristic.CHARACTERISTIC.CHARACTERISTIC_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Characteristic.CHARACTERISTIC.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Characteristic.CHARACTERISTIC.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return Characteristic.CHARACTERISTIC.MEASUREMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCharacteristicType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getMeasurementId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicRecord value2(String value) {
		setCharacteristicType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicRecord value3(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicRecord value4(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicRecord value5(Long value) {
		setMeasurementId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicRecord values(Long value1, String value2, String value3, String value4, Long value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CharacteristicRecord
	 */
	public CharacteristicRecord() {
		super(Characteristic.CHARACTERISTIC);
	}

	/**
	 * Create a detached, initialised CharacteristicRecord
	 */
	public CharacteristicRecord(Long id, String characteristicType, String description, String title, Long measurementId) {
		super(Characteristic.CHARACTERISTIC);

		setValue(0, id);
		setValue(1, characteristicType);
		setValue(2, description);
		setValue(3, title);
		setValue(4, measurementId);
	}
}