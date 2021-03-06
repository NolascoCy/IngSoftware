/**
 * This class is generated by jOOQ
 */
package database.tables;


import database.Public;
import database.tables.records.DetallecompraRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Detallecompra extends TableImpl<DetallecompraRecord> {

    private static final long serialVersionUID = 97011626;

    /**
     * The reference instance of <code>public.detallecompra</code>
     */
    public static final Detallecompra DETALLECOMPRA = new Detallecompra();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DetallecompraRecord> getRecordType() {
        return DetallecompraRecord.class;
    }

    /**
     * The column <code>public.detallecompra.idcompra</code>.
     */
    public final TableField<DetallecompraRecord, Integer> IDCOMPRA = createField("idcompra", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.detallecompra.idinsumo</code>.
     */
    public final TableField<DetallecompraRecord, Integer> IDINSUMO = createField("idinsumo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.detallecompra.cantidad</code>.
     */
    public final TableField<DetallecompraRecord, Double> CANTIDAD = createField("cantidad", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.detallecompra.precio</code>.
     */
    public final TableField<DetallecompraRecord, BigDecimal> PRECIO = createField("precio", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.detallecompra</code> table reference
     */
    public Detallecompra() {
        this("detallecompra", null);
    }

    /**
     * Create an aliased <code>public.detallecompra</code> table reference
     */
    public Detallecompra(String alias) {
        this(alias, DETALLECOMPRA);
    }

    private Detallecompra(String alias, Table<DetallecompraRecord> aliased) {
        this(alias, aliased, null);
    }

    private Detallecompra(String alias, Table<DetallecompraRecord> aliased, Field<?>[] parameters) {
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
    public Detallecompra as(String alias) {
        return new Detallecompra(alias, this);
    }

    /**
     * Rename this table
     */
    public Detallecompra rename(String name) {
        return new Detallecompra(name, null);
    }
}
