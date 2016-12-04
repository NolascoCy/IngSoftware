
package com.ues.ingsoftware.modelos;

import java.util.Date;
import java.util.List;

public class ModeloPedido {
    private int idpedido;
    private String numerolote;
    private Date fecha;
    private List<ModeloDetallePedido> detalle;
    private String estado;

    public ModeloPedido(int idpedido, String numerolote, Date fecha, List<ModeloDetallePedido> detalle, String estado) {
        this.idpedido = idpedido;
        this.numerolote = numerolote;
        this.fecha = fecha;
        this.detalle = detalle;
        this.estado = estado;
    }

    public ModeloPedido(String numerolote, Date fecha, List<ModeloDetallePedido> detalle, String estado) {
        this.numerolote = numerolote;
        this.fecha = fecha;
        this.detalle = detalle;
        this.estado = estado;
    }

    /**
     * @return the idpedido
     */
    public int getIdpedido() {
        return idpedido;
    }

    /**
     * @param idpedido the idpedido to set
     */
    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    /**
     * @return the numerolote
     */
    public String getNumerolote() {
        return numerolote;
    }

    /**
     * @param numerolote the numerolote to set
     */
    public void setNumerolote(String numerolote) {
        this.numerolote = numerolote;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the detalle
     */
    public List<ModeloDetallePedido> getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(List<ModeloDetallePedido> detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
