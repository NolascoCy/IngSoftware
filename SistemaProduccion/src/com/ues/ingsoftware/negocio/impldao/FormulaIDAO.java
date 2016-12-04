
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.FormulaDAO;
import com.ues.ingsoftware.modelos.ModeloFormula;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class FormulaIDAO implements FormulaDAO{
    DSLContext create;

    public FormulaIDAO(DSLContext create) {
        this.create = create;
    }
    
    @Override
    public void insertar(ModeloFormula t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloFormula t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloFormula t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloFormula> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
