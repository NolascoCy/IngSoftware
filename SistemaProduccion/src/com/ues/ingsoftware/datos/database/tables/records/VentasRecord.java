/**
 * This class is generated by jOOQ
 */
package database.tables.records;


import database.tables.Ventas;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class VentasRecord extends UpdatableRecordImpl<VentasRecord> implements Record7<Integer, Integer, String, Date, String, BigDecimal, String> {

    private static final long serialVersionUID = -1372493703;

    /**
     * Setter for <code>public.ventas.idventa</code>.
     */
    public void setIdventa(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ventas.idventa</code>.
     */
    public Integer getIdventa() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.ventas.num_documento</code>.
     */
    public void setNumDocumento(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ventas.num_documento</code>.
     */
    public Integer getNumDocumento() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.ventas.tipo_documento</code>.
     */
    public void setTipoDocumento(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ventas.tipo_documento</code>.
     */
    public String getTipoDocumento() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.ventas.fecha</code>.
     */
    public void setFecha(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ventas.fecha</code>.
     */
    public Date getFecha() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>public.ventas.idcliente</code>.
     */
    public void setIdcliente(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.ventas.idcliente</code>.
     */
    public String getIdcliente() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.ventas.abonos</code>.
     */
    public void setAbonos(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.ventas.abonos</code>.
     */
    public BigDecimal getAbonos() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>public.ventas.tipo_venta</code>.
     */
    public void setTipoVenta(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.ventas.tipo_venta</code>.
     */
    public String getTipoVenta() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Date, String, BigDecimal, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Date, String, BigDecimal, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Ventas.VENTAS.IDVENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Ventas.VENTAS.NUM_DOCUMENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Ventas.VENTAS.TIPO_DOCUMENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Ventas.VENTAS.FECHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Ventas.VENTAS.IDCLIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Ventas.VENTAS.ABONOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Ventas.VENTAS.TIPO_VENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdventa();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getNumDocumento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTipoDocumento();
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
    public String value5() {
        return getIdcliente();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAbonos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTipoVenta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value1(Integer value) {
        setIdventa(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value2(Integer value) {
        setNumDocumento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value3(String value) {
        setTipoDocumento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value4(Date value) {
        setFecha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value5(String value) {
        setIdcliente(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value6(BigDecimal value) {
        setAbonos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord value7(String value) {
        setTipoVenta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentasRecord values(Integer value1, Integer value2, String value3, Date value4, String value5, BigDecimal value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VentasRecord
     */
    public VentasRecord() {
        super(Ventas.VENTAS);
    }

    /**
     * Create a detached, initialised VentasRecord
     */
    public VentasRecord(Integer idventa, Integer numDocumento, String tipoDocumento, Date fecha, String idcliente, BigDecimal abonos, String tipoVenta) {
        super(Ventas.VENTAS);

        set(0, idventa);
        set(1, numDocumento);
        set(2, tipoDocumento);
        set(3, fecha);
        set(4, idcliente);
        set(5, abonos);
        set(6, tipoVenta);
    }
}