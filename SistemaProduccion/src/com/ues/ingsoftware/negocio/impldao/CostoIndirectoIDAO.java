
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.CostoIndirectoDAO;
import com.ues.ingsoftware.modelos.ModeloCostoIndirecto;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class CostoIndirectoIDAO implements CostoIndirectoDAO{
    DSLContext create;

    public CostoIndirectoIDAO(DSLContext create) {
        this.create = create;
    }
    
    @Override
    public void insertar(ModeloCostoIndirecto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloCostoIndirecto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloCostoIndirecto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCostoIndirecto> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
