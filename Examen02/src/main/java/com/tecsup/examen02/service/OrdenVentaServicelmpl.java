
package com.tecsup.examen02.service;

import com.tecsup.examen02.dao.OrdenVentaDAO;
import com.tecsup.examen02.model.OrdenVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenVentaServicelmpl implements OrdenVentaService {

    private final OrdenVentaDAO ordenVentaDAO;

    @Autowired
    public OrdenVentaServicelmpl(OrdenVentaDAO ordenVentaDAO) {
        this.ordenVentaDAO = ordenVentaDAO;
    }

    @Override
    public List<OrdenVenta> listar() {
        return ordenVentaDAO.listar();
    }

    @Override
    public OrdenVenta obtenerPorNroOrdenVta(String nroOrdenVta) {
        return ordenVentaDAO.buscarPorNroOrdenVta(nroOrdenVta);
    }

    @Override
    public void crear(OrdenVenta ordenVenta) {
        ordenVentaDAO.guardar(ordenVenta);
    }

    @Override
    public void actualizar(OrdenVenta ordenVenta) {
        ordenVentaDAO.actualizar(ordenVenta);
    }

    @Override
    public void eliminar(String nroOrdenVta) {
        ordenVentaDAO.eliminar(nroOrdenVta);
    }
}
