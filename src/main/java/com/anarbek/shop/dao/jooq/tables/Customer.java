/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.jooq.tables;


import com.anarbek.shop.dao.jooq.Keys;
import com.anarbek.shop.dao.jooq.Public;
import com.anarbek.shop.dao.jooq.tables.records.CustomerRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Customer extends TableImpl<CustomerRecord> {

	private static final long serialVersionUID = 929350638;

	/**
	 * The reference instance of <code>public.customer</code>
	 */
	public static final Customer CUSTOMER = new Customer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CustomerRecord> getRecordType() {
		return CustomerRecord.class;
	}

	/**
	 * The column <code>public.customer.id</code>.
	 */
	public final TableField<CustomerRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.customer.first_name</code>.
	 */
	public final TableField<CustomerRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.customer.last_name</code>.
	 */
	public final TableField<CustomerRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>public.customer</code> table reference
	 */
	public Customer() {
		this("customer", null);
	}

	/**
	 * Create an aliased <code>public.customer</code> table reference
	 */
	public Customer(String alias) {
		this(alias, CUSTOMER);
	}

	private Customer(String alias, Table<CustomerRecord> aliased) {
		this(alias, aliased, null);
	}

	private Customer(String alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CustomerRecord> getPrimaryKey() {
		return Keys.CUSTOMER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CustomerRecord>> getKeys() {
		return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.CUSTOMER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Customer as(String alias) {
		return new Customer(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Customer rename(String name) {
		return new Customer(name, null);
	}
}
