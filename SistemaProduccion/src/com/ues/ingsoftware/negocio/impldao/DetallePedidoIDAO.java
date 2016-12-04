
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.DetallePedidoDAO;
import com.ues.ingsoftware.modelos.ModeloDetallePedido;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class DetallePedidoIDAO implements DetallePedidoDAO {
    DSLContext create;

    public DetallePedidoIDAO(DSLContext create) {
        this.create = create;
    }
    @Override
    public void insertar(ModeloDetallePedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloDetallePedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloDetallePedido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloDetallePedido> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
