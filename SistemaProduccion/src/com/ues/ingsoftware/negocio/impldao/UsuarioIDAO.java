
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.UsuarioDAO;
import com.ues.ingsoftware.modelos.ModeloUsuario;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import static org.jooq.impl.DSL.count;

public class UsuarioIDAO implements UsuarioDAO{    
    private DSLContext contexto;

    public UsuarioIDAO(DSLContext contexto) {
        this.contexto = contexto;
    }

    @Override
    public void insertar(ModeloUsuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloUsuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloUsuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloUsuario> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
