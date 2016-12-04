
package com.ues.ingsoftware.impldao;
import com.ues.ingsoftware.dao.CargoDAO;
import com.ues.ingsoftware.dao.CategoriaInsumoDAO;
import com.ues.ingsoftware.dao.CategoriaProductoDAO;
import com.ues.ingsoftware.dao.ClienteDAO;
import com.ues.ingsoftware.dao.CompraDAO;
import com.ues.ingsoftware.dao.CostoIndirectoDAO;
import com.ues.ingsoftware.dao.DAOManager;
import com.ues.ingsoftware.dao.DetalleCompraDAO;
import com.ues.ingsoftware.dao.DetallePedidoDAO;
import com.ues.ingsoftware.dao.EmpleadoDAO;
import com.ues.ingsoftware.dao.FormulaDAO;
import com.ues.ingsoftware.dao.InsumoDAO;
import com.ues.ingsoftware.dao.MedidaDAO;
import com.ues.ingsoftware.dao.ModuloDAO;
import com.ues.ingsoftware.dao.PedidoDAO;
import com.ues.ingsoftware.dao.PermisoDAO;
import com.ues.ingsoftware.dao.ProductoDAO;
import com.ues.ingsoftware.dao.ProveedorDAO;
import com.ues.ingsoftware.dao.UnidadDAO;
import com.ues.ingsoftware.dao.UsuarioDAO;
import org.jooq.DSLContext;

public class DAOManagerIMPL implements DAOManager{
    private static CargoDAO cargo = null;
    private static CategoriaInsumoDAO categoriaInsumo = null;
    private static CategoriaProductoDAO categoriaProducto = null;
    private static ClienteDAO cliente = null;
    private static CompraDAO compra = null;
    private static CostoIndirectoDAO costoIndirecto = null;
    private static DetalleCompraDAO detalleCompra = null;
    private static DetallePedidoDAO detallePedido = null;
    private static EmpleadoDAO empleado = null;
    private static FormulaDAO formula = null;
    private static InsumoDAO insumo = null;
    private static MedidaDAO medida = null;
    private static ModuloDAO modulo = null;
    private static PedidoDAO pedido = null;
    private static PermisoDAO permiso = null;
    private static ProductoDAO producto = null;
    private static ProveedorDAO proveedor = null;
    private static UnidadDAO unidad = null;
    private static UsuarioDAO usuario = null;
    
    DSLContext create;

    public DAOManagerIMPL(DSLContext contexto) {
        this.create = contexto;
    }

    @Override
    public CargoDAO getCargoDAO() {
        if(cargo == null) cargo = new CargoIDAO(this.create);
        return cargo;
    }

    @Override
    public CategoriaInsumoDAO getCategoriaInsumoDAO() {
        if(categoriaInsumo == null) categoriaInsumo = new CategoriaInsumoIDAO(this.create);
        return categoriaInsumo;
    }

    @Override
    public CategoriaProductoDAO getCategoriaProductoDAO() { 
        if (categoriaProducto == null) categoriaProducto = new CategoriaProductoIDAO(this.create);
        return categoriaProducto;
    }

    @Override
    public ClienteDAO getClienteDAO() {
        if(cliente == null) cliente = new ClienteIDAO(this.create);
        return cliente;
    }

    @Override
    public CompraDAO getCompraDAO() {
        if (compra == null) compra = new CompraIDAO(this.create);
        return compra;
    }

    @Override
    public CostoIndirectoDAO getCostoIndirectoDAO() {
        if(costoIndirecto == null) costoIndirecto = new CostoIndirectoIDAO(this.create);
        return costoIndirecto;
    }

    @Override
    public DetalleCompraDAO getDetalleCompraDAO() {
        if(detalleCompra == null) detalleCompra = new DetalleCompraIDAO(this.create);
        return detalleCompra;
    }

    @Override
    public DetallePedidoDAO getDetallePedidoDAO() {
        if(detallePedido == null) detallePedido = new DetallePedidoIDAO(this.create);
        return detallePedido;
    }

    @Override
    public EmpleadoDAO getEmpleadoDAO() {
        if(empleado == null) empleado = new EmpleadoIDAO(this.create);
        return empleado;
    }

    @Override
    public FormulaDAO getFormulaDAO() {
        if(formula == null) formula = new FormulaIDAO(this.create);
        return formula;
    }

    @Override
    public InsumoDAO getInsumoDAO() {
        if(insumo == null) insumo = new InsumoIDAO(this.create);
        return insumo;
    }

    @Override
    public MedidaDAO getMedidaDAO() {
        if(medida == null) medida = new MedidaIDAO(this.create);
        return medida;
    }

    @Override
    public ModuloDAO getModuloDAO() {
        if(modulo == null) modulo = new ModuloIDAO(this.create);
        return modulo;
    }

    @Override
    public PedidoDAO getPedidoDAO() {
        if(pedido == null) pedido = new PedidoIDAO(this.create);
        return pedido;
    }

    @Override
    public PermisoDAO getPermisoDAO() {
        if(permiso == null) permiso = new PermisoIDAO(this.create);
        return permiso;
    }

    @Override
    public ProductoDAO getProductoDAO() {
        if(producto == null) producto = new ProductoIDAO(this.create);
        return producto;
    }

    @Override
    public ProveedorDAO getProveedorDAO() {
        if(proveedor == null) proveedor = new ProveedorIDAO(this.create);
        return proveedor;
    }

    @Override
    public UnidadDAO getUnidadDAO() {
        if (unidad == null) unidad = new UnidadIDAO(this.create);
        return unidad;
    }

    @Override
    public UsuarioDAO getUsuarioDAO() { 
        if(usuario == null) usuario = new UsuarioIDAO(this.create);
        return usuario;
    }
    
}
