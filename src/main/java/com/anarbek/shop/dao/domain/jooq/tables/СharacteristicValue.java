/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq.tables;


import com.anarbek.shop.dao.domain.jooq.Keys;
import com.anarbek.shop.dao.domain.jooq.Public;
import com.anarbek.shop.dao.domain.jooq.tables.records.СharacteristicValueRecord;

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
public class СharacteristicValue extends TableImpl<СharacteristicValueRecord> {

	private static final long serialVersionUID = -1979973283;

	/**
	 * The reference instance of <code>public.сharacteristic_value</code>
	 */
	public static final СharacteristicValue СHARACTERISTIC_VALUE = new СharacteristicValue();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<СharacteristicValueRecord> getRecordType() {
		return СharacteristicValueRecord.class;
	}

	/**
	 * The column <code>public.сharacteristic_value.id</code>.
	 */
	public final TableField<СharacteristicValueRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.сharacteristic_value.date_value</code>.
	 */
	public final TableField<СharacteristicValueRecord, Timestamp> DATE_VALUE = createField("date_value", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.сharacteristic_value.double_value</code>.
	 */
	public final TableField<СharacteristicValueRecord, Double> DOUBLE_VALUE = createField("double_value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>public.сharacteristic_value.string_value</code>.
	 */
	public final TableField<СharacteristicValueRecord, String> STRING_VALUE = createField("string_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.сharacteristic_value.product_id</code>.
	 */
	public final TableField<СharacteristicValueRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.сharacteristic_value.сharacteristic_id</code>.
	 */
	public final TableField<СharacteristicValueRecord, Long> СHARACTERISTIC_ID = createField("сharacteristic_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.сharacteristic_value</code> table reference
	 */
	public СharacteristicValue() {
		this("сharacteristic_value", null);
	}

	/**
	 * Create an aliased <code>public.сharacteristic_value</code> table reference
	 */
	public СharacteristicValue(String alias) {
		this(alias, СHARACTERISTIC_VALUE);
	}

	private СharacteristicValue(String alias, Table<СharacteristicValueRecord> aliased) {
		this(alias, aliased, null);
	}

	private СharacteristicValue(String alias, Table<СharacteristicValueRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<СharacteristicValueRecord> getPrimaryKey() {
		return Keys.СHARACTERISTIC_VALUE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<СharacteristicValueRecord>> getKeys() {
		return Arrays.<UniqueKey<СharacteristicValueRecord>>asList(Keys.СHARACTERISTIC_VALUE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<СharacteristicValueRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<СharacteristicValueRecord, ?>>asList(Keys.СHARACTERISTIC_VALUE__FK_5M69FGPVRA88QX0PN9013EU8R, Keys.СHARACTERISTIC_VALUE__FK_ISHXS45F8NNOLC8KCP097QGVG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public СharacteristicValue as(String alias) {
		return new СharacteristicValue(alias, this);
	}

	/**
	 * Rename this table
	 */
	public СharacteristicValue rename(String name) {
		return new СharacteristicValue(name, null);
	}
}
