/**
 * This class is generated by jOOQ
 */
package database.tables;


import database.Keys;
import database.Public;
import database.tables.records.ProductosRecord;

import java.math.BigDecimal;
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
public class Productos extends TableImpl<ProductosRecord> {

    private static final long serialVersionUID = 1216189063;

    /**
     * The reference instance of <code>public.productos</code>
     */
    public static final Productos PRODUCTOS = new Productos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductosRecord> getRecordType() {
        return ProductosRecord.class;
    }

    /**
     * The column <code>public.productos.idproducto</code>.
     */
    public final TableField<ProductosRecord, Integer> IDPRODUCTO = createField("idproducto", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.productos.nombre</code>.
     */
    public final TableField<ProductosRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.productos.descripcion</code>.
     */
    public final TableField<ProductosRecord, String> DESCRIPCION = createField("descripcion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.productos.foto</code>.
     */
    public final TableField<ProductosRecord, String> FOTO = createField("foto", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.productos.idcategoria</code>.
     */
    public final TableField<ProductosRecord, Integer> IDCATEGORIA = createField("idcategoria", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.productos.color</code>.
     */
    public final TableField<ProductosRecord, String> COLOR = createField("color", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.productos.precio_venta</code>.
     */
    public final TableField<ProductosRecord, BigDecimal> PRECIO_VENTA = createField("precio_venta", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * The column <code>public.productos.idformula</code>.
     */
    public final TableField<ProductosRecord, Integer> IDFORMULA = createField("idformula", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.productos.unidad_medida</code>.
     */
    public final TableField<ProductosRecord, String> UNIDAD_MEDIDA = createField("unidad_medida", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.productos.max</code>.
     */
    public final TableField<ProductosRecord, Double> MAX = createField("max", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.productos.min</code>.
     */
    public final TableField<ProductosRecord, Double> MIN = createField("min", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.productos.stock</code>.
     */
    public final TableField<ProductosRecord, Double> STOCK = createField("stock", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>public.productos</code> table reference
     */
    public Productos() {
        this("productos", null);
    }

    /**
     * Create an aliased <code>public.productos</code> table reference
     */
    public Productos(String alias) {
        this(alias, PRODUCTOS);
    }

    private Productos(String alias, Table<ProductosRecord> aliased) {
        this(alias, aliased, null);
    }

    private Productos(String alias, Table<ProductosRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ProductosRecord> getPrimaryKey() {
        return Keys.PRODUCTOS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductosRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductosRecord>>asList(Keys.PRODUCTOS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Productos as(String alias) {
        return new Productos(alias, this);
    }

    /**
     * Rename this table
     */
    public Productos rename(String name) {
        return new Productos(name, null);
    }
}
