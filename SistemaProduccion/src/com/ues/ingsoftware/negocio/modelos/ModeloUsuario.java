
package com.ues.ingsoftware.modelos;

import java.util.List;

public class ModeloUsuario {
    private ModeloEmpleado empleado;
    private String usuario;
    private String password;
    private List<ModeloPermiso> permisos;

    public ModeloUsuario(ModeloEmpleado empleado, String usuario, String password, List<ModeloPermiso> permisos) {
        this.empleado = empleado;
        this.usuario = usuario;
        this.password = password;
        this.permisos = permisos;
    }
    
    /**
     * @return the empleado
     */
    public ModeloEmpleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(ModeloEmpleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the permisos
     */
    public List<ModeloPermiso> getPermisos() {
        return permisos;
    }

    /**
     * @param permisos the permisos to set
     */
    public void setPermisos(List<ModeloPermiso> permisos) {
        this.permisos = permisos;
    }
}
