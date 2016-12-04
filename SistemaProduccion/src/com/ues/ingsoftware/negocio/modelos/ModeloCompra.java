
package com.ues.ingsoftware.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ModeloCompra {
    private int idcompra;
    private String numerodocumento;
    private Date fecha;
    private ModeloProveedor proveedor;
    private List<ModeloDetalleCompra> detalle;
    private BigDecimal total;
    private BigDecimal saldopendiente;
    private BigDecimal Aabonos;

    public ModeloCompra(int idcompra, String numerodocumento, Date fecha, ModeloProveedor proveedor, List<ModeloDetalleCompra> detalle, BigDecimal total, BigDecimal saldopendiente, BigDecimal Aabonos) {
        this.idcompra = idcompra;
        this.numerodocumento = numerodocumento;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.detalle = detalle;
        this.total = total;
        this.saldopendiente = saldopendiente;
        this.Aabonos = Aabonos;
    }

    public ModeloCompra(String numerodocumento, Date fecha, ModeloProveedor proveedor, List<ModeloDetalleCompra> detalle, BigDecimal total, BigDecimal saldopendiente, BigDecimal Aabonos) {
        this.numerodocumento = numerodocumento;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.detalle = detalle;
        this.total = total;
        this.saldopendiente = saldopendiente;
        this.Aabonos = Aabonos;
    }

    /**
     * @return the idcompra
     */
    public int getIdcompra() {
        return idcompra;
    }

    /**
     * @param idcompra the idcompra to set
     */
    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    /**
     * @return the numerodocumento
     */
    public String getNumerodocumento() {
        return numerodocumento;
    }

    /**
     * @param numerodocumento the numerodocumento to set
     */
    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
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
     * @return the proveedor
     */
    public ModeloProveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(ModeloProveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the detalle
     */
    public List<ModeloDetalleCompra> getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(List<ModeloDetalleCompra> detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * @return the saldopendiente
     */
    public BigDecimal getSaldopendiente() {
        return saldopendiente;
    }

    /**
     * @param saldopendiente the saldopendiente to set
     */
    public void setSaldopendiente(BigDecimal saldopendiente) {
        this.saldopendiente = saldopendiente;
    }

    /**
     * @return the Aabonos
     */
    public BigDecimal getAabonos() {
        return Aabonos;
    }

    /**
     * @param Aabonos the Aabonos to set
     */
    public void setAabonos(BigDecimal Aabonos) {
        this.Aabonos = Aabonos;
    }
}
