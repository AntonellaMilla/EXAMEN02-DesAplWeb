package com.tecsup.examen02.dao;

import com.tecsup.examen02.model.OrdenVenta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrdenVentaDAOImpl implements OrdenVentaDAO {

    private final Map<String, OrdenVenta> baseDatos = new HashMap<>();

    @Override
    public List<OrdenVenta> listar() {
        return new ArrayList<>(baseDatos.values());
    }

    @Override
    public OrdenVenta buscarPorNroOrdenVta(String nroOrdenVta) {
        return baseDatos.get(nroOrdenVta);
    }

    @Override
    public void guardar(OrdenVenta ordenVenta) {
        baseDatos.put(ordenVenta.getNroOrdenVta(), ordenVenta);
    }

    @Override
    public void actualizar(OrdenVenta ordenVenta) {
        baseDatos.put(ordenVenta.getNroOrdenVta(), ordenVenta);
    }

    @Override
    public void eliminar(String nroOrdenVta) {
        baseDatos.remove(nroOrdenVta);
    }
}
