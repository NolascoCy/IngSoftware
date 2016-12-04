
package com.ues.ingsoftware.impldao;
import com.ues.ingsoftware.dao.ClienteDAO;
import com.ues.ingsoftware.modelos.ModeloCliente;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class ClienteIDAO implements ClienteDAO {
    
    DSLContext create;

    public ClienteIDAO(DSLContext contexto) {
        this.create = contexto;
    }

    @Override
    public void insertar(ModeloCliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloCliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloCliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCliente> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
