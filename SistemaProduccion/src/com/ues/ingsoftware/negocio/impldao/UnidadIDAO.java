
package com.ues.ingsoftware.impldao;
import com.ues.ingsoftware.dao.UnidadDAO;
import com.ues.ingsoftware.modelos.ModeloUnidad;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class UnidadIDAO implements UnidadDAO{
    private DSLContext contexto;

    public UnidadIDAO(DSLContext contexto) {
        this.contexto = contexto;
    }    

    @Override
    public void insertar(ModeloUnidad t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloUnidad t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloUnidad t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloUnidad> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
