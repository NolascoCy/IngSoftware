/**
 * This class is generated by jOOQ
 */
package database.tables.records;


import database.tables.Detalleformula;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class DetalleformulaRecord extends TableRecordImpl<DetalleformulaRecord> implements Record4<Integer, Integer, Double, Integer> {

    private static final long serialVersionUID = 395463175;

    /**
     * Setter for <code>public.detalleformula.idformula</code>.
     */
    public void setIdformula(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.detalleformula.idformula</code>.
     */
    public Integer getIdformula() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.detalleformula.idinsumo</code>.
     */
    public void setIdinsumo(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.detalleformula.idinsumo</code>.
     */
    public Integer getIdinsumo() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.detalleformula.cantidad</code>.
     */
    public void setCantidad(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.detalleformula.cantidad</code>.
     */
    public Double getCantidad() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.detalleformula.unidad_medida</code>.
     */
    public void setUnidadMedida(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.detalleformula.unidad_medida</code>.
     */
    public Integer getUnidadMedida() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Double, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Double, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Detalleformula.DETALLEFORMULA.IDFORMULA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Detalleformula.DETALLEFORMULA.IDINSUMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Detalleformula.DETALLEFORMULA.CANTIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Detalleformula.DETALLEFORMULA.UNIDAD_MEDIDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdformula();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIdinsumo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getCantidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUnidadMedida();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleformulaRecord value1(Integer value) {
        setIdformula(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleformulaRecord value2(Integer value) {
        setIdinsumo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleformulaRecord value3(Double value) {
        setCantidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleformulaRecord value4(Integer value) {
        setUnidadMedida(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleformulaRecord values(Integer value1, Integer value2, Double value3, Integer value4) {
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
     * Create a detached DetalleformulaRecord
     */
    public DetalleformulaRecord() {
        super(Detalleformula.DETALLEFORMULA);
    }

    /**
     * Create a detached, initialised DetalleformulaRecord
     */
    public DetalleformulaRecord(Integer idformula, Integer idinsumo, Double cantidad, Integer unidadMedida) {
        super(Detalleformula.DETALLEFORMULA);

        set(0, idformula);
        set(1, idinsumo);
        set(2, cantidad);
        set(3, unidadMedida);
    }
}
