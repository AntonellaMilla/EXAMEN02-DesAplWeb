package com.tecsup.examen02.service;


import com.tecsup.examen02.dao.DetalleOrdenVtaDAO;
import com.tecsup.examen02.model.DetalleOrdenVta;
import com.tecsup.examen02.service.DetalleOrdenVtaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenVtaServicelmpl implements DetalleOrdenVtaService {

    private final DetalleOrdenVtaDAO detalleOrdenVtaDAO;

    @Autowired
    public DetalleOrdenVtaServicelmpl(DetalleOrdenVtaDAO detalleOrdenVtaDAO) {
        this.detalleOrdenVtaDAO = detalleOrdenVtaDAO;
    }

    @Override
    public List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta) {
        return detalleOrdenVtaDAO.listarPorNroOrdenVta(nroOrdenVta);
    }

    @Override
    public DetalleOrdenVta obtenerPorId(String nroOrdenVta, String codMedicamento) {
        return detalleOrdenVtaDAO.buscarPorId(nroOrdenVta, codMedicamento);
    }

    @Override
    public void crear(DetalleOrdenVta detalleOrdenVta) {
        detalleOrdenVtaDAO.guardar(detalleOrdenVta);
    }

    @Override
    public void actualizar(DetalleOrdenVta detalleOrdenVta) {
        detalleOrdenVtaDAO.actualizar(detalleOrdenVta);
    }

    @Override
    public void eliminar(String nroOrdenVta, String codMedicamento) {
        detalleOrdenVtaDAO.eliminar(nroOrdenVta, codMedicamento);
    }
}
