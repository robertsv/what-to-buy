/**
 * This class is generated by jOOQ
 */
package lv.whattobuy.domain.tables;

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
public class Databasechangelog extends org.jooq.impl.TableImpl<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> {

	private static final long serialVersionUID = -1144598606;

	/**
	 * The reference instance of <code>public.databasechangelog</code>
	 */
	public static final lv.whattobuy.domain.tables.Databasechangelog DATABASECHANGELOG = new lv.whattobuy.domain.tables.Databasechangelog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> getRecordType() {
		return lv.whattobuy.domain.tables.records.DatabasechangelogRecord.class;
	}

	/**
	 * The column <code>public.databasechangelog.id</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(63).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.author</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR.length(63).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.filename</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.dateexecuted</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.sql.Timestamp> DATEEXECUTED = createField("dateexecuted", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.orderexecuted</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.Integer> ORDEREXECUTED = createField("orderexecuted", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.exectype</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> EXECTYPE = createField("exectype", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.md5sum</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> MD5SUM = createField("md5sum", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>public.databasechangelog.description</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.databasechangelog.comments</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.databasechangelog.tag</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.databasechangelog.liquibase</code>.
	 */
	public final org.jooq.TableField<lv.whattobuy.domain.tables.records.DatabasechangelogRecord, java.lang.String> LIQUIBASE = createField("liquibase", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * Create a <code>public.databasechangelog</code> table reference
	 */
	public Databasechangelog() {
		this("databasechangelog", null);
	}

	/**
	 * Create an aliased <code>public.databasechangelog</code> table reference
	 */
	public Databasechangelog(java.lang.String alias) {
		this(alias, lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG);
	}

	private Databasechangelog(java.lang.String alias, org.jooq.Table<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> aliased) {
		this(alias, aliased, null);
	}

	private Databasechangelog(java.lang.String alias, org.jooq.Table<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, lv.whattobuy.domain.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> getPrimaryKey() {
		return lv.whattobuy.domain.Keys.PK_DATABASECHANGELOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangelogRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangelogRecord>>asList(lv.whattobuy.domain.Keys.PK_DATABASECHANGELOG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public lv.whattobuy.domain.tables.Databasechangelog as(java.lang.String alias) {
		return new lv.whattobuy.domain.tables.Databasechangelog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public lv.whattobuy.domain.tables.Databasechangelog rename(java.lang.String name) {
		return new lv.whattobuy.domain.tables.Databasechangelog(name, null);
	}
}
