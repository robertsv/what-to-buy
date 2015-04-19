/**
 * This class is generated by jOOQ
 */
package lv.whattobuy.domain;

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
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 188292925;

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
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			lv.whattobuy.domain.Sequences.ITEM_SEQ,
			lv.whattobuy.domain.Sequences.USER_ROLES_SEQ,
			lv.whattobuy.domain.Sequences.USER_SEQ);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			lv.whattobuy.domain.tables.Databasechangelog.DATABASECHANGELOG,
			lv.whattobuy.domain.tables.Databasechangeloglock.DATABASECHANGELOGLOCK,
			lv.whattobuy.domain.tables.Item.ITEM,
			lv.whattobuy.domain.tables.User.USER,
			lv.whattobuy.domain.tables.UserRoles.USER_ROLES);
	}
}
