
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.ProveedorDAO;
import com.ues.ingsoftware.modelos.ModeloProveedor;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class ProveedorIDAO implements ProveedorDAO{
    DSLContext create;

    public ProveedorIDAO(DSLContext create) {
        this.create = create;
    }
    @Override
    public void insertar(ModeloProveedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloProveedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloProveedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloProveedor> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
