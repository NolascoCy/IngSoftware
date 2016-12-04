
package com.ues.ingsoftware.dao;

import java.util.List;
import org.jooq.Condition;

public interface DAO<T>{
    void insertar(T t);
    void editar(T t);
    void eliminar(T t);
    List<T> getLista(Condition condition);
    
}
