
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.ProductoDAO;
import com.ues.ingsoftware.modelos.ModeloProducto;
import java.util.ArrayList;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectQuery;

public class ProductoIDAO implements ProductoDAO{
    private DSLContext contexto;
    
    public ProductoIDAO(DSLContext contexto) {
        this.contexto = contexto;
    }

    @Override
    public void insertar(ModeloProducto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloProducto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloProducto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloProducto> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
