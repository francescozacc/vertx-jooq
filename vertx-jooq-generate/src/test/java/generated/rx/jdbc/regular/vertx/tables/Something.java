/*
 * This file is generated by jOOQ.
*/
package generated.rx.jdbc.regular.vertx.tables;


import generated.rx.jdbc.regular.vertx.Indexes;
import generated.rx.jdbc.regular.vertx.Keys;
import generated.rx.jdbc.regular.vertx.Vertx;
import generated.rx.jdbc.regular.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.JsonArrayConverter;
import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Something extends TableImpl<SomethingRecord> {

    private static final long serialVersionUID = 1160235620;

    /**
     * The reference instance of <code>VERTX.SOMETHING</code>
     */
    public static final Something SOMETHING = new Something();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingRecord> getRecordType() {
        return SomethingRecord.class;
    }

    /**
     * The column <code>VERTX.SOMETHING.SOMEID</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEID = createField("SOMEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    public final TableField<SomethingRecord, String> SOMESTRING = createField("SOMESTRING", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    public final TableField<SomethingRecord, Long> SOMEHUGENUMBER = createField("SOMEHUGENUMBER", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    public final TableField<SomethingRecord, Short> SOMESMALLNUMBER = createField("SOMESMALLNUMBER", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEREGULARNUMBER = createField("SOMEREGULARNUMBER", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    public final TableField<SomethingRecord, Boolean> SOMEBOOLEAN = createField("SOMEBOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    public final TableField<SomethingRecord, Double> SOMEDOUBLE = createField("SOMEDOUBLE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    public final TableField<SomethingRecord, JsonObject> SOMEJSONOBJECT = createField("SOMEJSONOBJECT", org.jooq.impl.SQLDataType.VARCHAR(45), this, "", new JsonObjectConverter());

    /**
     * The column <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    public final TableField<SomethingRecord, JsonArray> SOMEJSONARRAY = createField("SOMEJSONARRAY", org.jooq.impl.SQLDataType.VARCHAR(45), this, "", new JsonArrayConverter());

    /**
     * The column <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    public final TableField<SomethingRecord, LocalDateTime> SOMETIMESTAMP = createField("SOMETIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>VERTX.SOMETHING</code> table reference
     */
    public Something() {
        this(DSL.name("SOMETHING"), null);
    }

    /**
     * Create an aliased <code>VERTX.SOMETHING</code> table reference
     */
    public Something(String alias) {
        this(DSL.name(alias), SOMETHING);
    }

    /**
     * Create an aliased <code>VERTX.SOMETHING</code> table reference
     */
    public Something(Name alias) {
        this(alias, SOMETHING);
    }

    private Something(Name alias, Table<SomethingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Something(Name alias, Table<SomethingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Vertx.VERTX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_IDX_SYS_PK_10463_10465);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SomethingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SOMETHING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SomethingRecord> getPrimaryKey() {
        return Keys.SYS_PK_10463;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SomethingRecord>> getKeys() {
        return Arrays.<UniqueKey<SomethingRecord>>asList(Keys.SYS_PK_10463);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Something as(String alias) {
        return new Something(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Something as(Name alias) {
        return new Something(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Something rename(String name) {
        return new Something(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Something rename(Name name) {
        return new Something(name, null);
    }
}
