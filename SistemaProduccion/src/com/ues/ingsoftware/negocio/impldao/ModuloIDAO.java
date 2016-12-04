
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.ModuloDAO;
import com.ues.ingsoftware.modelos.ModeloModulo;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class ModuloIDAO implements ModuloDAO{
    DSLContext create;

    public ModuloIDAO(DSLContext create) {
        this.create = create;
    }
    @Override
    public void insertar(ModeloModulo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloModulo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloModulo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloModulo> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
