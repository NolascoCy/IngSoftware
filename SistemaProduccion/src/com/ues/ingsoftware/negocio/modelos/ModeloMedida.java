
package com.ues.ingsoftware.modelos;

public class ModeloMedida {
    private int idmedida;
    private String medida;

    public ModeloMedida(int idmedida, String medida) {
        this.idmedida = idmedida;
        this.medida = medida;
    }

    /**
     * @return the idmedida
     */
    public int getIdmedida() {
        return idmedida;
    }

    /**
     * @param idmedida the idmedida to set
     */
    public void setIdmedida(int idmedida) {
        this.idmedida = idmedida;
    }

    /**
     * @return the medida
     */
    public String getMedida() {
        return medida;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida(String medida) {
        this.medida = medida;
    }
}
