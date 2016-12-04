/**
 * This class is generated by jOOQ
 */
package database.tables;


import database.Keys;
import database.Public;
import database.tables.records.FormulaRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
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
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Formula extends TableImpl<FormulaRecord> {

    private static final long serialVersionUID = 976364508;

    /**
     * The reference instance of <code>public.formula</code>
     */
    public static final Formula FORMULA = new Formula();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FormulaRecord> getRecordType() {
        return FormulaRecord.class;
    }

    /**
     * The column <code>public.formula.idformula</code>.
     */
    public final TableField<FormulaRecord, Integer> IDFORMULA = createField("idformula", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.formula.nomb_producto</code>.
     */
    public final TableField<FormulaRecord, String> NOMB_PRODUCTO = createField("nomb_producto", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.formula</code> table reference
     */
    public Formula() {
        this("formula", null);
    }

    /**
     * Create an aliased <code>public.formula</code> table reference
     */
    public Formula(String alias) {
        this(alias, FORMULA);
    }

    private Formula(String alias, Table<FormulaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Formula(String alias, Table<FormulaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FormulaRecord> getPrimaryKey() {
        return Keys.FORMULA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FormulaRecord>> getKeys() {
        return Arrays.<UniqueKey<FormulaRecord>>asList(Keys.FORMULA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Formula as(String alias) {
        return new Formula(alias, this);
    }

    /**
     * Rename this table
     */
    public Formula rename(String name) {
        return new Formula(name, null);
    }
}
