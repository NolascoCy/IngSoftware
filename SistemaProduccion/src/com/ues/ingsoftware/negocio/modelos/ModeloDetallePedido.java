
package com.ues.ingsoftware.modelos;

public class ModeloDetallePedido {
    private ModeloPedido pedido;
    private ModeloProducto producto;
    private double cantidad;

    public ModeloDetallePedido(ModeloPedido pedido, ModeloProducto producto, double cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * @return the pedido
     */
    public ModeloPedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(ModeloPedido pedido) {
        this.pedido = pedido;
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
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
