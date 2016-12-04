/**
 * This class is generated by jOOQ
 */
package database.tables.records;


import database.tables.Insumos;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class InsumosRecord extends UpdatableRecordImpl<InsumosRecord> implements Record8<Integer, String, Integer, String, BigDecimal, Double, Double, Double> {

    private static final long serialVersionUID = -1276015176;

    /**
     * Setter for <code>public.insumos.idinsumo</code>.
     */
    public void setIdinsumo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.insumos.idinsumo</code>.
     */
    public Integer getIdinsumo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.insumos.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.insumos.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.insumos.idcategoria</code>.
     */
    public void setIdcategoria(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.insumos.idcategoria</code>.
     */
    public Integer getIdcategoria() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.insumos.unidad_medida</code>.
     */
    public void setUnidadMedida(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.insumos.unidad_medida</code>.
     */
    public String getUnidadMedida() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.insumos.costo</code>.
     */
    public void setCosto(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.insumos.costo</code>.
     */
    public BigDecimal getCosto() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.insumos.max</code>.
     */
    public void setMax(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.insumos.max</code>.
     */
    public Double getMax() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.insumos.min</code>.
     */
    public void setMin(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.insumos.min</code>.
     */
    public Double getMin() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.insumos.stock</code>.
     */
    public void setStock(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.insumos.stock</code>.
     */
    public Double getStock() {
        return (Double) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, String, BigDecimal, Double, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, String, BigDecimal, Double, Double, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Insumos.INSUMOS.IDINSUMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Insumos.INSUMOS.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Insumos.INSUMOS.IDCATEGORIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Insumos.INSUMOS.UNIDAD_MEDIDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Insumos.INSUMOS.COSTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Insumos.INSUMOS.MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Insumos.INSUMOS.MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Insumos.INSUMOS.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdinsumo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNombre();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdcategoria();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUnidadMedida();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCosto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value1(Integer value) {
        setIdinsumo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value3(Integer value) {
        setIdcategoria(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value4(String value) {
        setUnidadMedida(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value5(BigDecimal value) {
        setCosto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value6(Double value) {
        setMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value7(Double value) {
        setMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord value8(Double value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumosRecord values(Integer value1, String value2, Integer value3, String value4, BigDecimal value5, Double value6, Double value7, Double value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InsumosRecord
     */
    public InsumosRecord() {
        super(Insumos.INSUMOS);
    }

    /**
     * Create a detached, initialised InsumosRecord
     */
    public InsumosRecord(Integer idinsumo, String nombre, Integer idcategoria, String unidadMedida, BigDecimal costo, Double max, Double min, Double stock) {
        super(Insumos.INSUMOS);

        set(0, idinsumo);
        set(1, nombre);
        set(2, idcategoria);
        set(3, unidadMedida);
        set(4, costo);
        set(5, max);
        set(6, min);
        set(7, stock);
    }
}