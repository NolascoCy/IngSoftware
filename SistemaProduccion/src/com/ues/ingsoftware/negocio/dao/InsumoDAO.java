package com.ues.ingsoftware.dao;

import com.ues.ingsoftware.modelos.ModeloInsumo;

public interface InsumoDAO extends DAO<ModeloInsumo>{
    void descontarInsumo(ModeloInsumo insumo, double descuento);
    ModeloInsumo findByID(int id);
}
