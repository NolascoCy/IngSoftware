
package com.ues.ingsoftware.modelos;

import java.math.BigDecimal;

public class ModeloInsumo {
    private int idinsumo;
    private String nombre;
    private ModeloCategoriaInsumo categoria;
    private BigDecimal costo;
    private double stock;
    private double minimo;
    private double maximo;
    private ModeloUnidad unidad;

    public ModeloInsumo(String nombre, ModeloCategoriaInsumo categoria, BigDecimal costo, double stock, double minimo, double maximo, ModeloUnidad unidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.stock = stock;
        this.minimo = minimo;
        this.maximo = maximo;
        this.unidad = unidad;
    }

    public ModeloInsumo(int idinsumo, String nombre, ModeloCategoriaInsumo categoria, BigDecimal costo, double stock, double minimo, double maximo, ModeloUnidad unidad) {
        this.idinsumo = idinsumo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.stock = stock;
        this.minimo = minimo;
        this.maximo = maximo;
        this.unidad = unidad;
    }

    /**
     * @return the idinsumo
     */
    public int getIdinsumo() {
        return idinsumo;
    }

    /**
     * @param idinsumo the idinsumo to set
     */
    public void setIdinsumo(int idinsumo) {
        this.idinsumo = idinsumo;
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
     * @return the categoria
     */
    public ModeloCategoriaInsumo getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(ModeloCategoriaInsumo categoria) {
        this.categoria = categoria;
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
