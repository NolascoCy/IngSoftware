
package com.ues.ingsoftware.modelos;

import java.math.BigDecimal;

public class ModeloCargo {
    private int idcargo;
    private String nombre;
    private BigDecimal sueldo;
    private boolean cif;

    public ModeloCargo(int idcargo, String nombre, BigDecimal sueldo, boolean cif) {
        this.idcargo = idcargo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.cif = cif;
    }

    public ModeloCargo(String nombre, BigDecimal sueldo, boolean cif) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.cif = cif;
    }

    /**
     * @return the idcargo
     */
    public int getIdcargo() {
        return idcargo;
    }

    /**
     * @param idcargo the idcargo to set
     */
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
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
     * @return the sueldo
     */
    public BigDecimal getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the cif
     */
    public boolean isCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(boolean cif) {
        this.cif = cif;
    }
    
}
