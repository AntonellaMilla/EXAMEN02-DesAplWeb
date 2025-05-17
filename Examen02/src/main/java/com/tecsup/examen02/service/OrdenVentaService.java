
package com.tecsup.examen02.service;

import com.tecsup.examen02.model.OrdenVenta;
import java.util.List;

public interface OrdenVentaService {

    List<OrdenVenta> listar();

    OrdenVenta obtenerPorNroOrdenVta(String nroOrdenVta);

    void crear(OrdenVenta ordenVenta);

    void actualizar(OrdenVenta ordenVenta);

    void eliminar(String nroOrdenVta);
}
