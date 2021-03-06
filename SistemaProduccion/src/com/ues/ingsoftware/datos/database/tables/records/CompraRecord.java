/**
 * This class is generated by jOOQ
 */
package database.tables.records;


import database.tables.Compra;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class CompraRecord extends UpdatableRecordImpl<CompraRecord> implements Record5<Integer, String, Integer, Date, BigDecimal> {

    private static final long serialVersionUID = -1704894103;

    /**
     * Setter for <code>public.compra.idcompra</code>.
     */
    public void setIdcompra(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.compra.idcompra</code>.
     */
    public Integer getIdcompra() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.compra.numero_documento</code>.
     */
    public void setNumeroDocumento(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.compra.numero_documento</code>.
     */
    public String getNumeroDocumento() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.compra.idproveedor</code>.
     */
    public void setIdproveedor(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.compra.idproveedor</code>.
     */
    public Integer getIdproveedor() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.compra.fecha</code>.
     */
    public void setFecha(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.compra.fecha</code>.
     */
    public Date getFecha() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>public.compra.abonos</code>.
     */
    public void setAbonos(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.compra.abonos</code>.
     */
    public BigDecimal getAbonos() {
        return (BigDecimal) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Date, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Date, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Compra.COMPRA.IDCOMPRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Compra.COMPRA.NUMERO_DOCUMENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Compra.COMPRA.IDPROVEEDOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Compra.COMPRA.FECHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Compra.COMPRA.ABONOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdcompra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNumeroDocumento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdproveedor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getFecha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAbonos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value1(Integer value) {
        setIdcompra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value2(String value) {
        setNumeroDocumento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value3(Integer value) {
        setIdproveedor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value4(Date value) {
        setFecha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value5(BigDecimal value) {
        setAbonos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord values(Integer value1, String value2, Integer value3, Date value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompraRecord
     */
    public CompraRecord() {
        super(Compra.COMPRA);
    }

    /**
     * Create a detached, initialised CompraRecord
     */
    public CompraRecord(Integer idcompra, String numeroDocumento, Integer idproveedor, Date fecha, BigDecimal abonos) {
        super(Compra.COMPRA);

        set(0, idcompra);
        set(1, numeroDocumento);
        set(2, idproveedor);
        set(3, fecha);
        set(4, abonos);
    }
}
