
package com.ues.ingsoftware.impldao;

import com.ues.ingsoftware.dao.EmpleadoDAO;
import com.ues.ingsoftware.modelos.ModeloEmpleado;
import static database.tables.Empleado.EMPLEADO;
import java.util.List;
import org.jooq.Condition;
import org.jooq.DSLContext;

public class EmpleadoIDAO implements EmpleadoDAO {
    private DSLContext create;

    public EmpleadoIDAO(DSLContext contexto) {
        this.create = contexto;
    }

    @Override
    public void insertar(ModeloEmpleado empleado) {
        int idempleado = create.insertInto(EMPLEADO)
                .set(EMPLEADO.NOMBRE, empleado.getNombre())
                .set(EMPLEADO.DIRECCION,empleado.getDireccion())
                .set(EMPLEADO.TELEFONO,empleado.getTelefono())
                .set(EMPLEADO.DUI,empleado.getDui())
                .returning(EMPLEADO.IDEMPLEADO).fetchOne().getValue(EMPLEADO.IDEMPLEADO);
        empleado.setIdempleado(idempleado);                
    }

    @Override
    public void editar(ModeloEmpleado t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ModeloEmpleado t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloEmpleado> getLista(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
