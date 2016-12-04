
package com.ues.ingsoftware.modelos;

public class ModeloModulo {
    private int idmodulo;
    private String modulo;

    public ModeloModulo(int idmodulo, String modulo) {
        this.idmodulo = idmodulo;
        this.modulo = modulo;
    }

    /**
     * @return the idmodulo
     */
    public int getIdmodulo() {
        return idmodulo;
    }

    /**
     * @param idmodulo the idmodulo to set
     */
    public void setIdmodulo(int idmodulo) {
        this.idmodulo = idmodulo;
    }

    /**
     * @return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
}
