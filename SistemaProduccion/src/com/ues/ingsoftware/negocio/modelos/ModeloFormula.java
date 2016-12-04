
package com.ues.ingsoftware.modelos;

public class ModeloFormula {
    private ModeloProducto producto;
    private ModeloInsumo insumo;
    private double descargo;
    private ModeloUnidad unidad;

    public ModeloFormula(ModeloProducto producto, ModeloInsumo insumo, double descargo, ModeloUnidad unidad) {
        this.producto = producto;
        this.insumo = insumo;
        this.descargo = descargo;
        this.unidad = unidad;
    }

    /**
     * @return the producto
     */
    public ModeloProducto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(ModeloProducto producto) {
        this.producto = producto;
    }

    /**
     * @return the insumo
     */
    public ModeloInsumo getInsumo() {
        return insumo;
    }

    /**
     * @param insumo the insumo to set
     */
    public void setInsumo(ModeloInsumo insumo) {
        this.insumo = insumo;
    }

    /**
     * @return the descargo
     */
    public double getDescargo() {
        return descargo;
    }

    /**
     * @param descargo the descargo to set
     */
    public void setDescargo(double descargo) {
        this.descargo = descargo;
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
