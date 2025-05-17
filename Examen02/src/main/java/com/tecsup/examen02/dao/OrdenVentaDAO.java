package com.tecsup.examen02.dao;

import com.tecsup.examen02.model.OrdenVenta;
import java.util.List;

public interface OrdenVentaDAO {

    List<OrdenVenta> listar();
    OrdenVenta buscarPorNroOrdenVta(String nroOrdenVta);
    void guardar(OrdenVenta ordenVenta);
    void actualizar(OrdenVenta ordenVenta);
    void eliminar(String nroOrdenVta);
}
