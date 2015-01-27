/**
 * This class is generated by jOOQ
 */
package lv.whattobuy.domain.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabasechangelogRecord extends org.jooq.impl.UpdatableRecordImpl<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> implements org.jooq.Record11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1528861187;

	/**
	 * Setter for <code>public.databasechangelog.id</code>.
	 */
	public void setId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.id</code>.
	 */
	public java.lang.String getId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.databasechangelog.author</code>.
	 */
	public void setAuthor(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.author</code>.
	 */
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.databasechangelog.filename</code>.
	 */
	public void setFilename(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.filename</code>.
	 */
	public java.lang.String getFilename() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.databasechangelog.dateexecuted</code>.
	 */
	public void setDateexecuted(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.dateexecuted</code>.
	 */
	public java.sql.Timestamp getDateexecuted() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.databasechangelog.orderexecuted</code>.
	 */
	public void setOrderexecuted(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.orderexecuted</code>.
	 */
	public java.lang.Integer getOrderexecuted() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.databasechangelog.exectype</code>.
	 */
	public void setExectype(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.exectype</code>.
	 */
	public java.lang.String getExectype() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.databasechangelog.md5sum</code>.
	 */
	public void setMd5sum(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.md5sum</code>.
	 */
	public java.lang.String getMd5sum() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.databasechangelog.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>public.databasechangelog.comments</code>.
	 */
	public void setComments(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.comments</code>.
	 */
	public java.lang.String getComments() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>public.databasechangelog.tag</code>.
	 */
	public void setTag(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.tag</code>.
	 */
	public java.lang.String getTag() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>public.databasechangelog.liquibase</code>.
	 */
	public void setLiquibase(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.databasechangelog.liquibase</code>.
	 */
	public java.lang.String getLiquibase() {
		return (java.lang.String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.FILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.DATEEXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.ORDEREXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.EXECTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.MD5SUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.COMMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.LIQUIBASE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getDateexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getOrderexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExectype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getMd5sum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getComments();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getLiquibase();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value1(java.lang.String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value2(java.lang.String value) {
		setAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value3(java.lang.String value) {
		setFilename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value4(java.sql.Timestamp value) {
		setDateexecuted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value5(java.lang.Integer value) {
		setOrderexecuted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value6(java.lang.String value) {
		setExectype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value7(java.lang.String value) {
		setMd5sum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value8(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value9(java.lang.String value) {
		setComments(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value10(java.lang.String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord value11(java.lang.String value) {
		setLiquibase(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangelogRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4, java.lang.Integer value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DatabasechangelogRecord
	 */
	public DatabasechangelogRecord() {
		super(lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG);
	}

	/**
	 * Create a detached, initialised DatabasechangelogRecord
	 */
	public DatabasechangelogRecord(java.lang.String id, java.lang.String author, java.lang.String filename, java.sql.Timestamp dateexecuted, java.lang.Integer orderexecuted, java.lang.String exectype, java.lang.String md5sum, java.lang.String description, java.lang.String comments, java.lang.String tag, java.lang.String liquibase) {
		super(lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG);

		setValue(0, id);
		setValue(1, author);
		setValue(2, filename);
		setValue(3, dateexecuted);
		setValue(4, orderexecuted);
		setValue(5, exectype);
		setValue(6, md5sum);
		setValue(7, description);
		setValue(8, comments);
		setValue(9, tag);
		setValue(10, liquibase);
	}
}
