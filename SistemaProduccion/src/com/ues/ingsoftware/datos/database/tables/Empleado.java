/**
 * This class is generated by jOOQ
 */
package database.tables;


import database.Keys;
import database.Public;
import database.tables.records.EmpleadoRecord;

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
public class Empleado extends TableImpl<EmpleadoRecord> {

    private static final long serialVersionUID = 1710939984;

    /**
     * The reference instance of <code>public.empleado</code>
     */
    public static final Empleado EMPLEADO = new Empleado();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmpleadoRecord> getRecordType() {
        return EmpleadoRecord.class;
    }

    /**
     * The column <code>public.empleado.idempleado</code>.
     */
    public final TableField<EmpleadoRecord, Integer> IDEMPLEADO = createField("idempleado", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.empleado.nombre</code>.
     */
    public final TableField<EmpleadoRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.empleado.direccion</code>.
     */
    public final TableField<EmpleadoRecord, String> DIRECCION = createField("direccion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.empleado.telefono</code>.
     */
    public final TableField<EmpleadoRecord, String> TELEFONO = createField("telefono", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.empleado.email</code>.
     */
    public final TableField<EmpleadoRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.empleado.nit</code>.
     */
    public final TableField<EmpleadoRecord, String> NIT = createField("nit", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.empleado.dui</code>.
     */
    public final TableField<EmpleadoRecord, String> DUI = createField("dui", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.empleado.idcargo</code>.
     */
    public final TableField<EmpleadoRecord, Integer> IDCARGO = createField("idcargo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.empleado</code> table reference
     */
    public Empleado() {
        this("empleado", null);
    }

    /**
     * Create an aliased <code>public.empleado</code> table reference
     */
    public Empleado(String alias) {
        this(alias, EMPLEADO);
    }

    private Empleado(String alias, Table<EmpleadoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Empleado(String alias, Table<EmpleadoRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EmpleadoRecord> getPrimaryKey() {
        return Keys.EMPLEADO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmpleadoRecord>> getKeys() {
        return Arrays.<UniqueKey<EmpleadoRecord>>asList(Keys.EMPLEADO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Empleado as(String alias) {
        return new Empleado(alias, this);
    }

    /**
     * Rename this table
     */
    public Empleado rename(String name) {
        return new Empleado(name, null);
    }
}
