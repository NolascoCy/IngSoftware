/**
 * This class is generated by jOOQ
 */
package database.tables;


import database.Keys;
import database.Public;
import database.tables.records.CompraRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class Compra extends TableImpl<CompraRecord> {

    private static final long serialVersionUID = -1617713939;

    /**
     * The reference instance of <code>public.compra</code>
     */
    public static final Compra COMPRA = new Compra();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompraRecord> getRecordType() {
        return CompraRecord.class;
    }

    /**
     * The column <code>public.compra.idcompra</code>.
     */
    public final TableField<CompraRecord, Integer> IDCOMPRA = createField("idcompra", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.compra.numero_documento</code>.
     */
    public final TableField<CompraRecord, String> NUMERO_DOCUMENTO = createField("numero_documento", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.compra.idproveedor</code>.
     */
    public final TableField<CompraRecord, Integer> IDPROVEEDOR = createField("idproveedor", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.compra.fecha</code>.
     */
    public final TableField<CompraRecord, Date> FECHA = createField("fecha", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.compra.abonos</code>.
     */
    public final TableField<CompraRecord, BigDecimal> ABONOS = createField("abonos", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * Create a <code>public.compra</code> table reference
     */
    public Compra() {
        this("compra", null);
    }

    /**
     * Create an aliased <code>public.compra</code> table reference
     */
    public Compra(String alias) {
        this(alias, COMPRA);
    }

    private Compra(String alias, Table<CompraRecord> aliased) {
        this(alias, aliased, null);
    }

    private Compra(String alias, Table<CompraRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CompraRecord> getPrimaryKey() {
        return Keys.COMPRA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompraRecord>> getKeys() {
        return Arrays.<UniqueKey<CompraRecord>>asList(Keys.COMPRA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Compra as(String alias) {
        return new Compra(alias, this);
    }

    /**
     * Rename this table
     */
    public Compra rename(String name) {
        return new Compra(name, null);
    }
}
