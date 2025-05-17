package com.tecsup.examen02.model;

public class DetalleOrdenVta {

    private String nroOrdenVta; // Clave Foránea (parte de clave primaria compuesta)
    private String codMedicamento; // Parte de clave primaria compuesta
    private String descripcionMed;
    private int cantidadRequerida;

    public DetalleOrdenVta() {
    }

    public DetalleOrdenVta(String nroOrdenVta, String codMedicamento, String descripcionMed, int cantidadRequerida) {
        this.nroOrdenVta = nroOrdenVta;
        this.codMedicamento = codMedicamento;
        this.descripcionMed = descripcionMed;
        this.cantidadRequerida = cantidadRequerida;
    }

    public String getNroOrdenVta() {
        return nroOrdenVta;
    }

    public void setNroOrdenVta(String nroOrdenVta) {
        this.nroOrdenVta = nroOrdenVta;
    }

    public String getCodMedicamento() {
        return codMedicamento;
    }

    public void setCodMedicamento(String codMedicamento) {
        this.codMedicamento = codMedicamento;
    }

    public String getDescripcionMed() {
        return descripcionMed;
    }

    public void setDescripcionMed(String descripcionMed) {
        this.descripcionMed = descripcionMed;
    }

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(int cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }
}
