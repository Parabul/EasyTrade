/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq.tables;


import com.anarbek.shop.dao.domain.jooq.Keys;
import com.anarbek.shop.dao.domain.jooq.Public;
import com.anarbek.shop.dao.domain.jooq.tables.records.CharacteristicValueRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class CharacteristicValue extends TableImpl<CharacteristicValueRecord> {

	private static final long serialVersionUID = 1976108955;

	/**
	 * The reference instance of <code>public.characteristic_value</code>
	 */
	public static final CharacteristicValue CHARACTERISTIC_VALUE = new CharacteristicValue();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CharacteristicValueRecord> getRecordType() {
		return CharacteristicValueRecord.class;
	}

	/**
	 * The column <code>public.characteristic_value.id</code>.
	 */
	public final TableField<CharacteristicValueRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.characteristic_value.date_value</code>.
	 */
	public final TableField<CharacteristicValueRecord, Timestamp> DATE_VALUE = createField("date_value", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.characteristic_value.double_value</code>.
	 */
	public final TableField<CharacteristicValueRecord, Double> DOUBLE_VALUE = createField("double_value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>public.characteristic_value.string_value</code>.
	 */
	public final TableField<CharacteristicValueRecord, String> STRING_VALUE = createField("string_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.characteristic_value.characteristic_id</code>.
	 */
	public final TableField<CharacteristicValueRecord, Long> CHARACTERISTIC_ID = createField("characteristic_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.characteristic_value.product_id</code>.
	 */
	public final TableField<CharacteristicValueRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.characteristic_value</code> table reference
	 */
	public CharacteristicValue() {
		this("characteristic_value", null);
	}

	/**
	 * Create an aliased <code>public.characteristic_value</code> table reference
	 */
	public CharacteristicValue(String alias) {
		this(alias, CHARACTERISTIC_VALUE);
	}

	private CharacteristicValue(String alias, Table<CharacteristicValueRecord> aliased) {
		this(alias, aliased, null);
	}

	private CharacteristicValue(String alias, Table<CharacteristicValueRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CharacteristicValueRecord> getPrimaryKey() {
		return Keys.CHARACTERISTIC_VALUE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CharacteristicValueRecord>> getKeys() {
		return Arrays.<UniqueKey<CharacteristicValueRecord>>asList(Keys.CHARACTERISTIC_VALUE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CharacteristicValueRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CharacteristicValueRecord, ?>>asList(Keys.CHARACTERISTIC_VALUE__FK_JX672GO7SRNA7S8WJWNYKCLS9, Keys.CHARACTERISTIC_VALUE__FK_8RVXP5IF9WE3HNY0G41CQFVFN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacteristicValue as(String alias) {
		return new CharacteristicValue(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CharacteristicValue rename(String name) {
		return new CharacteristicValue(name, null);
	}
}