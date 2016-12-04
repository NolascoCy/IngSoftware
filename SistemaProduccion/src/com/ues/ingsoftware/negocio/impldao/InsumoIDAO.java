
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.InsumoDAO;
import com.ues.ingsoftware.modelos.ModeloInsumo;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class InsumoIDAO implements InsumoDAO{
    private DSLContext contexto;

    public InsumoIDAO(DSLContext contexto) {
        this.contexto = contexto;
    }

    @Override
    public void descontarInsumo(ModeloInsumo insumo, double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloInsumo findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(ModeloInsumo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloInsumo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloInsumo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloInsumo> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
