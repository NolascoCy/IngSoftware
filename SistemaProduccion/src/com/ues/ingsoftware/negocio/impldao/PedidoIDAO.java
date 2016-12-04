
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.PedidoDAO;
import com.ues.ingsoftware.modelos.ModeloPedido;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class PedidoIDAO implements PedidoDAO{
    DSLContext create;

    public PedidoIDAO(DSLContext create) {
        this.create = create;
    }
    @Override
    public void insertar(ModeloPedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloPedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloPedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloPedido> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
