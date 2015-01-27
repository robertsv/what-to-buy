/**
 * This class is generated by jOOQ
 */
package lv.whattobuy.domain;

/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<lv.whattobuy.domain.tables.records.ItemRecord, java.lang.Long> IDENTITY_ITEM = Identities0.IDENTITY_ITEM;
	public static final org.jooq.Identity<lv.whattobuy.domain.tables.records.UserRecord, java.lang.Long> IDENTITY_USER = Identities0.IDENTITY_USER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> PK_DATABASECHANGELOG = UniqueKeys0.PK_DATABASECHANGELOG;
	public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = UniqueKeys0.PK_DATABASECHANGELOGLOCK;
	public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.ItemRecord> PKEY_ITEM = UniqueKeys0.PKEY_ITEM;
	public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.UserRecord> PKEY_USER = UniqueKeys0.PKEY_USER;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<lv.whattobuy.domain.tables.records.ItemRecord, lv.whattobuy.domain.tables.records.UserRecord> ITEM__FK_USER_ITEM = ForeignKeys0.ITEM__FK_USER_ITEM;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<lv.whattobuy.domain.tables.records.ItemRecord, java.lang.Long> IDENTITY_ITEM = createIdentity(lv.whattobuy.domain.tables.Item.ITEM, lv.whattobuy.domain.tables.Item.ITEM.ID);
		public static org.jooq.Identity<lv.whattobuy.domain.tables.records.UserRecord, java.lang.Long> IDENTITY_USER = createIdentity(lv.whattobuy.domain.tables.User.USER, lv.whattobuy.domain.tables.User.USER.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangelogRecord> PK_DATABASECHANGELOG = createUniqueKey(lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG, lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.ID, lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.AUTHOR, lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG.FILENAME);
		public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = createUniqueKey(lv.whattobuy.domain.tables.Databasechangeloglock.DATABASECHANGELOGLOCK, lv.whattobuy.domain.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
		public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.ItemRecord> PKEY_ITEM = createUniqueKey(lv.whattobuy.domain.tables.Item.ITEM, lv.whattobuy.domain.tables.Item.ITEM.ID);
		public static final org.jooq.UniqueKey<lv.whattobuy.domain.tables.records.UserRecord> PKEY_USER = createUniqueKey(lv.whattobuy.domain.tables.User.USER, lv.whattobuy.domain.tables.User.USER.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<lv.whattobuy.domain.tables.records.ItemRecord, lv.whattobuy.domain.tables.records.UserRecord> ITEM__FK_USER_ITEM = createForeignKey(lv.whattobuy.domain.Keys.PKEY_USER, lv.whattobuy.domain.tables.Item.ITEM, lv.whattobuy.domain.tables.Item.ITEM.USER_ID);
	}
}