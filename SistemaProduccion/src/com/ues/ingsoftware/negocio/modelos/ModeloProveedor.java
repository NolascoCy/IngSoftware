
package com.ues.ingsoftware.modelos;

import java.math.BigDecimal;

public class ModeloProveedor {
    private int idproveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String NIT;
    private String NRC;
    private String representante;
    private String tipo;
    private BigDecimal limitecredito;
    private int tiempopago;

    public ModeloProveedor(int idproveedor, String nombre, String direccion, String telefono, String email, String NIT, String NRC, String representante, String tipo, BigDecimal limitecredito, int tiempopago) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.NIT = NIT;
        this.NRC = NRC;
        this.representante = representante;
        this.tipo = tipo;
        this.limitecredito = limitecredito;
        this.tiempopago = tiempopago;
    }

    public ModeloProveedor(String nombre, String direccion, String telefono, String email, String NIT, String NRC, String representante, String tipo, BigDecimal limitecredito, int tiempopago) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.NIT = NIT;
        this.NRC = NRC;
        this.representante = representante;
        this.tipo = tipo;
        this.limitecredito = limitecredito;
        this.tiempopago = tiempopago;
    }

    /**
     * @return the idproveedor
     */
    public int getIdproveedor() {
        return idproveedor;
    }

    /**
     * @param idproveedor the idproveedor to set
     */
    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the NRC
     */
    public String getNRC() {
        return NRC;
    }

    /**
     * @param NRC the NRC to set
     */
    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    /**
     * @return the representante
     */
    public String getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the limitecredito
     */
    public BigDecimal getLimitecredito() {
        return limitecredito;
    }

    /**
     * @param limitecredito the limitecredito to set
     */
    public void setLimitecredito(BigDecimal limitecredito) {
        this.limitecredito = limitecredito;
    }

    /**
     * @return the tiempopago
     */
    public int getTiempopago() {
        return tiempopago;
    }

    /**
     * @param tiempopago the tiempopago to set
     */
    public void setTiempopago(int tiempopago) {
        this.tiempopago = tiempopago;
    }

}
