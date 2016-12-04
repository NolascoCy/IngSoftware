/**
 * This class is generated by jOOQ
 */
package database.tables.records;


import database.tables.Cargo;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CargoRecord extends UpdatableRecordImpl<CargoRecord> implements Record4<Integer, String, BigDecimal, Boolean> {

    private static final long serialVersionUID = 1354565847;

    /**
     * Setter for <code>public.cargo.idcargo</code>.
     */
    public void setIdcargo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.cargo.idcargo</code>.
     */
    public Integer getIdcargo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.cargo.nombre_cargo</code>.
     */
    public void setNombreCargo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.cargo.nombre_cargo</code>.
     */
    public String getNombreCargo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.cargo.sueldo</code>.
     */
    public void setSueldo(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.cargo.sueldo</code>.
     */
    public BigDecimal getSueldo() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>public.cargo.aplica_mod</code>.
     */
    public void setAplicaMod(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.cargo.aplica_mod</code>.
     */
    public Boolean getAplicaMod() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, BigDecimal, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, BigDecimal, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Cargo.CARGO.IDCARGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Cargo.CARGO.NOMBRE_CARGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Cargo.CARGO.SUELDO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Cargo.CARGO.APLICA_MOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdcargo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNombreCargo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getSueldo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getAplicaMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CargoRecord value1(Integer value) {
        setIdcargo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CargoRecord value2(String value) {
        setNombreCargo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CargoRecord value3(BigDecimal value) {
        setSueldo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CargoRecord value4(Boolean value) {
        setAplicaMod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CargoRecord values(Integer value1, String value2, BigDecimal value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CargoRecord
     */
    public CargoRecord() {
        super(Cargo.CARGO);
    }

    /**
     * Create a detached, initialised CargoRecord
     */
    public CargoRecord(Integer idcargo, String nombreCargo, BigDecimal sueldo, Boolean aplicaMod) {
        super(Cargo.CARGO);

        set(0, idcargo);
        set(1, nombreCargo);
        set(2, sueldo);
        set(3, aplicaMod);
    }
}