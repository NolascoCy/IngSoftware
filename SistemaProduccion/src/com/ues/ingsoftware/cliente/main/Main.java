
package com.ues.ingsoftware.main;

import com.ues.ingsoftware.dao.DAOManager;
import com.ues.ingsoftware.impldao.DAOManagerIMPL;
import com.ues.ingsoftware.modelos.ModeloCargo;
import com.ues.ingsoftware.modelos.ModeloEmpleado;
import com.ues.ingsoftware.util.Conexion;
import java.math.BigDecimal;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class Main {
    static DSLContext create;
    static DAOManager manager;
    static Conexion conexion;
    public static void main(String[] args) {
        conexion = new Conexion("postgres","root","localhost","5432","ingsoftware");
        conexion.conectar();
        create = DSL.using(conexion.getConexion(), SQLDialect.POSTGRES_9_5);
        manager = new DAOManagerIMPL(create);
        ModeloEmpleado empleado1 = new ModeloEmpleado(
                "Fulano","Osicala","1234-1234","hola@gmail.com","123456789-0","1234-123456-789-0",new ModeloCargo(
                        1,"cargo",new BigDecimal(0.00),false
                )
        );
        manager.getEmpleadoDAO().insertar(empleado1);
        System.out.println("El empleado tiene el ID: "+empleado1.getIdempleado());
    }
    
}