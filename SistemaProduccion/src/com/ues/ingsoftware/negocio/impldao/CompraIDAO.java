
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.CompraDAO;
import com.ues.ingsoftware.modelos.ModeloCompra;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class CompraIDAO implements CompraDAO{
    DSLContext create;

    public CompraIDAO(DSLContext create) {
        this.create = create;
    }

    @Override
    public void insertar(ModeloCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCompra> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
