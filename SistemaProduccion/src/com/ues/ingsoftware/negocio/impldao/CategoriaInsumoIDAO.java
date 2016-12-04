
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.CategoriaInsumoDAO;
import com.ues.ingsoftware.modelos.ModeloCategoriaInsumo;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class CategoriaInsumoIDAO implements CategoriaInsumoDAO{
    DSLContext create;

    public CategoriaInsumoIDAO(DSLContext create) {
        this.create = create;
    }

    @Override
    public void insertar(ModeloCategoriaInsumo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloCategoriaInsumo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloCategoriaInsumo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCategoriaInsumo> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
