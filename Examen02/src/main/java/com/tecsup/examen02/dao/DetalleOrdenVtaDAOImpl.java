package com.tecsup.examen02.dao;

import org.springframework.stereotype.Repository;
import com.tecsup.examen02.dao.DetalleOrdenVtaDAO;
import com.tecsup.examen02.model.DetalleOrdenVta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DetalleOrdenVtaDAOImpl implements DetalleOrdenVtaDAO {

    private Map<String, Map<String, DetalleOrdenVta>> baseDatosDetalle = new HashMap<>();

    // Helper method to get the map for a specific NroOrdenVta
    private Map<String, DetalleOrdenVta> getDetalles(String nroOrdenVta) {
        return baseDatosDetalle.computeIfAbsent(nroOrdenVta, k -> new HashMap<>());
    }

    @Override
    public List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta) {
        return new ArrayList<>(getDetalles(nroOrdenVta).values());
    }

    @Override
    public DetalleOrdenVta buscarPorId(String nroOrdenVta, String codMedicamento) {
        return getDetalles(nroOrdenVta).get(codMedicamento);
    }

    @Override
    public void guardar(DetalleOrdenVta detalleOrdenVta) {
        getDetalles(detalleOrdenVta.getNroOrdenVta()).put(detalleOrdenVta.getCodMedicamento(), detalleOrdenVta);
    }

    @Override
    public void actualizar(DetalleOrdenVta detalleOrdenVta) {
        getDetalles(detalleOrdenVta.getNroOrdenVta()).put(detalleOrdenVta.getCodMedicamento(), detalleOrdenVta);
    }

    @Override
    public void eliminar(String nroOrdenVta, String codMedicamento) {
        getDetalles(nroOrdenVta).remove(codMedicamento);
    }
}
