/**
 * This class is generated by jOOQ
 */
package database;


import database.tables.Cargo;
import database.tables.Cliente;
import database.tables.Compra;
import database.tables.Costo;
import database.tables.Empleado;
import database.tables.Formula;
import database.tables.Insumos;
import database.tables.Pedido;
import database.tables.Productos;
import database.tables.Proveedor;
import database.tables.Usuario;
import database.tables.Ventas;
import database.tables.records.CargoRecord;
import database.tables.records.ClienteRecord;
import database.tables.records.CompraRecord;
import database.tables.records.CostoRecord;
import database.tables.records.EmpleadoRecord;
import database.tables.records.FormulaRecord;
import database.tables.records.InsumosRecord;
import database.tables.records.PedidoRecord;
import database.tables.records.ProductosRecord;
import database.tables.records.ProveedorRecord;
import database.tables.records.UsuarioRecord;
import database.tables.records.VentasRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CargoRecord> CARGO_PKEY = UniqueKeys0.CARGO_PKEY;
    public static final UniqueKey<ClienteRecord> CLIENTE_PKEY = UniqueKeys0.CLIENTE_PKEY;
    public static final UniqueKey<CompraRecord> COMPRA_PKEY = UniqueKeys0.COMPRA_PKEY;
    public static final UniqueKey<CostoRecord> COSTO_PKEY = UniqueKeys0.COSTO_PKEY;
    public static final UniqueKey<EmpleadoRecord> EMPLEADO_PKEY = UniqueKeys0.EMPLEADO_PKEY;
    public static final UniqueKey<FormulaRecord> FORMULA_PKEY = UniqueKeys0.FORMULA_PKEY;
    public static final UniqueKey<InsumosRecord> INSUMOS_PKEY = UniqueKeys0.INSUMOS_PKEY;
    public static final UniqueKey<PedidoRecord> PEDIDO_PKEY = UniqueKeys0.PEDIDO_PKEY;
    public static final UniqueKey<ProductosRecord> PRODUCTOS_PKEY = UniqueKeys0.PRODUCTOS_PKEY;
    public static final UniqueKey<ProveedorRecord> PROVEEDOR_PKEY = UniqueKeys0.PROVEEDOR_PKEY;
    public static final UniqueKey<UsuarioRecord> USUARIO_PKEY = UniqueKeys0.USUARIO_PKEY;
    public static final UniqueKey<VentasRecord> VENTAS_PKEY = UniqueKeys0.VENTAS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CargoRecord> CARGO_PKEY = createUniqueKey(Cargo.CARGO, "cargo_pkey", Cargo.CARGO.IDCARGO);
        public static final UniqueKey<ClienteRecord> CLIENTE_PKEY = createUniqueKey(Cliente.CLIENTE, "cliente_pkey", Cliente.CLIENTE.IDCLIENTE);
        public static final UniqueKey<CompraRecord> COMPRA_PKEY = createUniqueKey(Compra.COMPRA, "compra_pkey", Compra.COMPRA.IDCOMPRA);
        public static final UniqueKey<CostoRecord> COSTO_PKEY = createUniqueKey(Costo.COSTO, "costo_pkey", Costo.COSTO.IDCOSTO);
        public static final UniqueKey<EmpleadoRecord> EMPLEADO_PKEY = createUniqueKey(Empleado.EMPLEADO, "empleado_pkey", Empleado.EMPLEADO.IDEMPLEADO);
        public static final UniqueKey<FormulaRecord> FORMULA_PKEY = createUniqueKey(Formula.FORMULA, "formula_pkey", Formula.FORMULA.IDFORMULA);
        public static final UniqueKey<InsumosRecord> INSUMOS_PKEY = createUniqueKey(Insumos.INSUMOS, "insumos_pkey", Insumos.INSUMOS.IDINSUMO);
        public static final UniqueKey<PedidoRecord> PEDIDO_PKEY = createUniqueKey(Pedido.PEDIDO, "pedido_pkey", Pedido.PEDIDO.IDPEDIDO);
        public static final UniqueKey<ProductosRecord> PRODUCTOS_PKEY = createUniqueKey(Productos.PRODUCTOS, "productos_pkey", Productos.PRODUCTOS.IDPRODUCTO);
        public static final UniqueKey<ProveedorRecord> PROVEEDOR_PKEY = createUniqueKey(Proveedor.PROVEEDOR, "proveedor_pkey", Proveedor.PROVEEDOR.IDPROVEEDOR);
        public static final UniqueKey<UsuarioRecord> USUARIO_PKEY = createUniqueKey(Usuario.USUARIO, "usuario_pkey", Usuario.USUARIO.IDUSUARIO);
        public static final UniqueKey<VentasRecord> VENTAS_PKEY = createUniqueKey(Ventas.VENTAS, "ventas_pkey", Ventas.VENTAS.IDVENTA);
    }
}