/**
 * This class is generated by jOOQ
 */
package database.tables.records;


import database.tables.Productos;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class ProductosRecord extends UpdatableRecordImpl<ProductosRecord> implements Record12<Integer, String, String, String, Integer, String, BigDecimal, Integer, String, Double, Double, Double> {

    private static final long serialVersionUID = -1281732440;

    /**
     * Setter for <code>public.productos.idproducto</code>.
     */
    public void setIdproducto(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.productos.idproducto</code>.
     */
    public Integer getIdproducto() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.productos.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.productos.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.productos.descripcion</code>.
     */
    public void setDescripcion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.productos.descripcion</code>.
     */
    public String getDescripcion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.productos.foto</code>.
     */
    public void setFoto(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.productos.foto</code>.
     */
    public String getFoto() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.productos.idcategoria</code>.
     */
    public void setIdcategoria(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.productos.idcategoria</code>.
     */
    public Integer getIdcategoria() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.productos.color</code>.
     */
    public void setColor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.productos.color</code>.
     */
    public String getColor() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.productos.precio_venta</code>.
     */
    public void setPrecioVenta(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.productos.precio_venta</code>.
     */
    public BigDecimal getPrecioVenta() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>public.productos.idformula</code>.
     */
    public void setIdformula(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.productos.idformula</code>.
     */
    public Integer getIdformula() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.productos.unidad_medida</code>.
     */
    public void setUnidadMedida(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.productos.unidad_medida</code>.
     */
    public String getUnidadMedida() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.productos.max</code>.
     */
    public void setMax(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.productos.max</code>.
     */
    public Double getMax() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>public.productos.min</code>.
     */
    public void setMin(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.productos.min</code>.
     */
    public Double getMin() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.productos.stock</code>.
     */
    public void setStock(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.productos.stock</code>.
     */
    public Double getStock() {
        return (Double) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Integer, String, BigDecimal, Integer, String, Double, Double, Double> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Integer, String, BigDecimal, Integer, String, Double, Double, Double> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Productos.PRODUCTOS.IDPRODUCTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Productos.PRODUCTOS.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Productos.PRODUCTOS.DESCRIPCION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Productos.PRODUCTOS.FOTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Productos.PRODUCTOS.IDCATEGORIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Productos.PRODUCTOS.COLOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Productos.PRODUCTOS.PRECIO_VENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Productos.PRODUCTOS.IDFORMULA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Productos.PRODUCTOS.UNIDAD_MEDIDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return Productos.PRODUCTOS.MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return Productos.PRODUCTOS.MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return Productos.PRODUCTOS.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdproducto();
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
    public String value3() {
        return getDescripcion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIdcategoria();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPrecioVenta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getIdformula();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUnidadMedida();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value1(Integer value) {
        setIdproducto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value3(String value) {
        setDescripcion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value4(String value) {
        setFoto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value5(Integer value) {
        setIdcategoria(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value6(String value) {
        setColor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value7(BigDecimal value) {
        setPrecioVenta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value8(Integer value) {
        setIdformula(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value9(String value) {
        setUnidadMedida(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value10(Double value) {
        setMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value11(Double value) {
        setMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord value12(Double value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductosRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, BigDecimal value7, Integer value8, String value9, Double value10, Double value11, Double value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductosRecord
     */
    public ProductosRecord() {
        super(Productos.PRODUCTOS);
    }

    /**
     * Create a detached, initialised ProductosRecord
     */
    public ProductosRecord(Integer idproducto, String nombre, String descripcion, String foto, Integer idcategoria, String color, BigDecimal precioVenta, Integer idformula, String unidadMedida, Double max, Double min, Double stock) {
        super(Productos.PRODUCTOS);

        set(0, idproducto);
        set(1, nombre);
        set(2, descripcion);
        set(3, foto);
        set(4, idcategoria);
        set(5, color);
        set(6, precioVenta);
        set(7, idformula);
        set(8, unidadMedida);
        set(9, max);
        set(10, min);
        set(11, stock);
    }
}
