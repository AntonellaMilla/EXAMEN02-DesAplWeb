package com.tecsup.examen02.dao;

import com.tecsup.examen02.model.DetalleOrdenVta;
import java.util.List;

public interface DetalleOrdenVtaDAO {

    List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta);
    DetalleOrdenVta buscarPorId(String nroOrdenVta, String codMedicamento);
    void guardar(DetalleOrdenVta detalleOrdenVta);
    void actualizar(DetalleOrdenVta detalleOrdenVta);
    void eliminar(String nroOrdenVta, String codMedicamento);
}
