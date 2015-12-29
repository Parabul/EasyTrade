/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq.tables;


import com.anarbek.shop.dao.domain.jooq.Keys;
import com.anarbek.shop.dao.domain.jooq.Public;
import com.anarbek.shop.dao.domain.jooq.tables.records.ProductRecord;

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
public class Product extends TableImpl<ProductRecord> {

	private static final long serialVersionUID = 2131099835;

	/**
	 * The reference instance of <code>public.product</code>
	 */
	public static final Product PRODUCT = new Product();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProductRecord> getRecordType() {
		return ProductRecord.class;
	}

	/**
	 * The column <code>public.product.id</code>.
	 */
	public final TableField<ProductRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.product.description</code>.
	 */
	public final TableField<ProductRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>public.product.price</code>.
	 */
	public final TableField<ProductRecord, Double> PRICE = createField("price", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

	/**
	 * The column <code>public.product.title</code>.
	 */
	public final TableField<ProductRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * Create a <code>public.product</code> table reference
	 */
	public Product() {
		this("product", null);
	}

	/**
	 * Create an aliased <code>public.product</code> table reference
	 */
	public Product(String alias) {
		this(alias, PRODUCT);
	}

	private Product(String alias, Table<ProductRecord> aliased) {
		this(alias, aliased, null);
	}

	private Product(String alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProductRecord> getPrimaryKey() {
		return Keys.PRODUCT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProductRecord>> getKeys() {
		return Arrays.<UniqueKey<ProductRecord>>asList(Keys.PRODUCT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Product as(String alias) {
		return new Product(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Product rename(String name) {
		return new Product(name, null);
	}
}
