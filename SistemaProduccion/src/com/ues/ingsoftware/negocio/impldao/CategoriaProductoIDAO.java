
package com.ues.ingsoftware.impldao;
import com.ues.ingsoftware.dao.CategoriaProductoDAO;
import com.ues.ingsoftware.modelos.ModeloCategoriaProducto;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class CategoriaProductoIDAO implements CategoriaProductoDAO{
    
    DSLContext create;

    public CategoriaProductoIDAO(DSLContext contexto) {
        this.create = contexto;
    }

    @Override
    public void insertar(ModeloCategoriaProducto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloCategoriaProducto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloCategoriaProducto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCategoriaProducto> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
