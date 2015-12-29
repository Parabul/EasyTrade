/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq;


import com.anarbek.shop.dao.domain.jooq.tables.Customer;
import com.anarbek.shop.dao.domain.jooq.tables.Image;
import com.anarbek.shop.dao.domain.jooq.tables.Measurement;
import com.anarbek.shop.dao.domain.jooq.tables.Product;
import com.anarbek.shop.dao.domain.jooq.tables.ShopUser;
import com.anarbek.shop.dao.domain.jooq.tables.ShopUserRoles;
import com.anarbek.shop.dao.domain.jooq.tables.Сharacteristic;
import com.anarbek.shop.dao.domain.jooq.tables.СharacteristicValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

	private static final long serialVersionUID = 1571766980;

	/**
	 * The reference instance of <code>public</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.HIBERNATE_SEQUENCE);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Customer.CUSTOMER,
			Image.IMAGE,
			Measurement.MEASUREMENT,
			Product.PRODUCT,
			ShopUser.SHOP_USER,
			ShopUserRoles.SHOP_USER_ROLES,
			Сharacteristic.СHARACTERISTIC,
			СharacteristicValue.СHARACTERISTIC_VALUE);
	}
}