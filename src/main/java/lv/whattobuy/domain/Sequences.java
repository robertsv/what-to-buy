/**
 * This class is generated by jOOQ
 */
package lv.whattobuy.domain;

/**
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.item_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> ITEM_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("item_seq", lv.whattobuy.domain.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_seq", lv.whattobuy.domain.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}