
package com.ues.ingsoftware.dao;

public interface DAOManager {
    CargoDAO getCargoDAO();
    CategoriaInsumoDAO getCategoriaInsumoDAO();
    CategoriaProductoDAO getCategoriaProductoDAO();
    ClienteDAO getClienteDAO();
    CompraDAO getCompraDAO();
    CostoIndirectoDAO getCostoIndirectoDAO();
    DetalleCompraDAO getDetalleCompraDAO();
    DetallePedidoDAO getDetallePedidoDAO();
    EmpleadoDAO getEmpleadoDAO();
    FormulaDAO getFormulaDAO();
    InsumoDAO getInsumoDAO();
    MedidaDAO getMedidaDAO();
    ModuloDAO getModuloDAO();
    PedidoDAO getPedidoDAO();
    PermisoDAO getPermisoDAO();
    ProductoDAO getProductoDAO();
    ProveedorDAO getProveedorDAO();
    UnidadDAO getUnidadDAO();
    UsuarioDAO getUsuarioDAO();
}
