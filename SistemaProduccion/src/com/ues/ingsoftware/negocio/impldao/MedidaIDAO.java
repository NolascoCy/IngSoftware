
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.MedidaDAO;
import com.ues.ingsoftware.modelos.ModeloMedida;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class MedidaIDAO implements MedidaDAO{
    private DSLContext contexto;

    public MedidaIDAO(DSLContext contexto) {
        this.contexto = contexto;
    }    

    @Override
    public void insertar(ModeloMedida t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloMedida t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloMedida t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloMedida> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
