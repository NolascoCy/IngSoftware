package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.PermisoDAO;
import com.ues.ingsoftware.modelos.ModeloPermiso;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;


public class PermisoIDAO implements PermisoDAO{
    private DSLContext contexto;

    public PermisoIDAO(DSLContext contexto) {
        this.contexto = contexto;
    }    

    @Override
    public void insertar(ModeloPermiso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloPermiso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloPermiso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloPermiso> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
