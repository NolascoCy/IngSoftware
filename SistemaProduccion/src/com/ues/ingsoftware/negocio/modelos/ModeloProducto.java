
package com.ues.ingsoftware.modelos;

import java.math.BigDecimal;
import java.util.List;

public class ModeloProducto {
    private int idproducto;
    private String nombre;
    private byte[] foto;
    private ModeloCategoriaProducto categoria;
    private String color;
    private BigDecimal costo;
    private BigDecimal precioventa;
    private List<ModeloFormula> formula;
    private double stock;
    private double maximo;
    private double minimo;
    private ModeloUnidad unidad;

    public ModeloProducto(int idproducto, String nombre, byte[] foto, ModeloCategoriaProducto categoria, String color, BigDecimal costo, BigDecimal precioventa, List<ModeloFormula> formula, double stock, double maximo, double minimo, ModeloUnidad unidad) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.foto = foto;
        this.categoria = categoria;
        this.color = color;
        this.costo = costo;
        this.precioventa = precioventa;
        this.formula = formula;
        this.stock = stock;
        this.maximo = maximo;
        this.minimo = minimo;
        this.unidad = unidad;
    }

    public ModeloProducto(String nombre, byte[] foto, ModeloCategoriaProducto categoria, String color, BigDecimal costo, BigDecimal precioventa, List<ModeloFormula> formula, double stock, double maximo, double minimo, ModeloUnidad unidad) {
        this.nombre = nombre;
        this.foto = foto;
        this.categoria = categoria;
        this.color = color;
        this.costo = costo;
        this.precioventa = precioventa;
        this.formula = formula;
        this.stock = stock;
        this.maximo = maximo;
        this.minimo = minimo;
        this.unidad = unidad;
    }
    
    /**
     * @return the idproducto
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    /**
     * @return the categoria
     */
    public ModeloCategoriaProducto getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(ModeloCategoriaProducto categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the costo
     */
    public BigDecimal getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    /**
     * @return the precioventa
     */
    public BigDecimal getPrecioventa() {
        return precioventa;
    }

    /**
     * @param precioventa the precioventa to set
     */
    public void setPrecioventa(BigDecimal precioventa) {
        this.precioventa = precioventa;
    }

    /**
     * @return the formula
     */
    public List<ModeloFormula> getFormula() {
        return formula;
    }

    /**
     * @param formula the formula to set
     */
    public void setFormula(List<ModeloFormula> formula) {
        this.formula = formula;
    }

    /**
     * @return the stock
     */
    public double getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(double stock) {
        this.stock = stock;
    }

    /**
     * @return the maximo
     */
    public double getMaximo() {
        return maximo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    /**
     * @return the minimo
     */
    public double getMinimo() {
        return minimo;
    }

    /**
     * @param minimo the minimo to set
     */
    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    /**
     * @return the unidad
     */
    public ModeloUnidad getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(ModeloUnidad unidad) {
        this.unidad = unidad;
    }
}
