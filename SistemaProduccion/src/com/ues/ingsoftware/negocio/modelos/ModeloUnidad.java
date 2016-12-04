
package com.ues.ingsoftware.modelos;

public class ModeloUnidad {
    private int idunidad;
    private String unidad;
    private ModeloMedida medida;
    private ModeloUnidad unidadpadre;
    private double equivalencia;

    public ModeloUnidad(int idunidad, String unidad, ModeloMedida medida, ModeloUnidad unidadpadre, double equivalencia) {
        this.idunidad = idunidad;
        this.unidad = unidad;
        this.medida = medida;
        this.unidadpadre = unidadpadre;
        this.equivalencia = equivalencia;
    }

    public ModeloUnidad(int idunidad, String unidad, ModeloMedida medida, double equivalencia) {
        this.idunidad = idunidad;
        this.unidad = unidad;
        this.medida = medida;
        this.equivalencia = equivalencia;
    }

    /**
     * @return the idunidad
     */
    public int getIdunidad() {
        return idunidad;
    }

    /**
     * @param idunidad the idunidad to set
     */
    public void setIdunidad(int idunidad) {
        this.idunidad = idunidad;
    }

    /**
     * @return the unidad
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the medida
     */
    public ModeloMedida getMedida() {
        return medida;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida(ModeloMedida medida) {
        this.medida = medida;
    }

    /**
     * @return the unidadpadre
     */
    public ModeloUnidad getUnidadpadre() {
        return unidadpadre;
    }

    /**
     * @param unidadpadre the unidadpadre to set
     */
    public void setUnidadpadre(ModeloUnidad unidadpadre) {
        this.unidadpadre = unidadpadre;
    }

    /**
     * @return the equivalencia
     */
    public double getEquivalencia() {
        return equivalencia;
    }

    /**
     * @param equivalencia the equivalencia to set
     */
    public void setEquivalencia(double equivalencia) {
        this.equivalencia = equivalencia;
    }
    
}
