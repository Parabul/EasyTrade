/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq.tables;


import com.anarbek.shop.dao.domain.jooq.Keys;
import com.anarbek.shop.dao.domain.jooq.Public;
import com.anarbek.shop.dao.domain.jooq.tables.records.ImageRecord;

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
public class Image extends TableImpl<ImageRecord> {

	private static final long serialVersionUID = 590765643;

	/**
	 * The reference instance of <code>public.image</code>
	 */
	public static final Image IMAGE = new Image();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ImageRecord> getRecordType() {
		return ImageRecord.class;
	}

	/**
	 * The column <code>public.image.id</code>.
	 */
	public final TableField<ImageRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.image.content</code>.
	 */
	public final TableField<ImageRecord, Long> CONTENT = createField("content", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.image.is_main</code>.
	 */
	public final TableField<ImageRecord, Boolean> IS_MAIN = createField("is_main", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>public.image.mime_type</code>.
	 */
	public final TableField<ImageRecord, String> MIME_TYPE = createField("mime_type", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>public.image.title</code>.
	 */
	public final TableField<ImageRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>public.image.product_id</code>.
	 */
	public final TableField<ImageRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.image</code> table reference
	 */
	public Image() {
		this("image", null);
	}

	/**
	 * Create an aliased <code>public.image</code> table reference
	 */
	public Image(String alias) {
		this(alias, IMAGE);
	}

	private Image(String alias, Table<ImageRecord> aliased) {
		this(alias, aliased, null);
	}

	private Image(String alias, Table<ImageRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ImageRecord> getPrimaryKey() {
		return Keys.IMAGE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ImageRecord>> getKeys() {
		return Arrays.<UniqueKey<ImageRecord>>asList(Keys.IMAGE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ImageRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ImageRecord, ?>>asList(Keys.IMAGE__FK_MM4CMVTEO84WQ24UPFVUCDY08);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image as(String alias) {
		return new Image(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Image rename(String name) {
		return new Image(name, null);
	}
}
