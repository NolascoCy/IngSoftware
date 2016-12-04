
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.DetalleCompraDAO;
import com.ues.ingsoftware.modelos.ModeloDetalleCompra;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class DetalleCompraIDAO implements DetalleCompraDAO{
    DSLContext create;

    public DetalleCompraIDAO(DSLContext create) {
        this.create = create;
    }
    @Override
    public void insertar(ModeloDetalleCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloDetalleCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloDetalleCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloDetalleCompra> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
