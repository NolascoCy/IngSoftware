
package com.ues.ingsoftware.impldao;
import com.ues.ingsoftware.dao.CargoDAO;
import com.ues.ingsoftware.modelos.ModeloCargo;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class CargoIDAO implements CargoDAO {
    
    private DSLContext create;

    public CargoIDAO(DSLContext create) {
        this.create = create;
    }    

    @Override
    public void insertar(ModeloCargo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(ModeloCargo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloCargo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCargo> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
