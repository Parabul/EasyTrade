/**
 * This class is generated by jOOQ
 */
package com.anarbek.shop.dao.domain.jooq.tables.records;


import com.anarbek.shop.dao.domain.jooq.tables.Image;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ImageRecord extends UpdatableRecordImpl<ImageRecord> implements Record6<Long, Long, Boolean, String, String, Long> {

	private static final long serialVersionUID = 712511746;

	/**
	 * Setter for <code>public.image.id</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.image.id</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>public.image.content</code>.
	 */
	public void setContent(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.image.content</code>.
	 */
	public Long getContent() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>public.image.is_main</code>.
	 */
	public void setIsMain(Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.image.is_main</code>.
	 */
	public Boolean getIsMain() {
		return (Boolean) getValue(2);
	}

	/**
	 * Setter for <code>public.image.mime_type</code>.
	 */
	public void setMimeType(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.image.mime_type</code>.
	 */
	public String getMimeType() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.image.title</code>.
	 */
	public void setTitle(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.image.title</code>.
	 */
	public String getTitle() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.image.product_id</code>.
	 */
	public void setProductId(Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.image.product_id</code>.
	 */
	public Long getProductId() {
		return (Long) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Long, Long, Boolean, String, String, Long> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Long, Long, Boolean, String, String, Long> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Image.IMAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return Image.IMAGE.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field3() {
		return Image.IMAGE.IS_MAIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Image.IMAGE.MIME_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Image.IMAGE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field6() {
		return Image.IMAGE.PRODUCT_ID;
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
	public Long value2() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value3() {
		return getIsMain();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getMimeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value6() {
		return getProductId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord value2(Long value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord value3(Boolean value) {
		setIsMain(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord value4(String value) {
		setMimeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord value5(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord value6(Long value) {
		setProductId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImageRecord values(Long value1, Long value2, Boolean value3, String value4, String value5, Long value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ImageRecord
	 */
	public ImageRecord() {
		super(Image.IMAGE);
	}

	/**
	 * Create a detached, initialised ImageRecord
	 */
	public ImageRecord(Long id, Long content, Boolean isMain, String mimeType, String title, Long productId) {
		super(Image.IMAGE);

		setValue(0, id);
		setValue(1, content);
		setValue(2, isMain);
		setValue(3, mimeType);
		setValue(4, title);
		setValue(5, productId);
	}
}
