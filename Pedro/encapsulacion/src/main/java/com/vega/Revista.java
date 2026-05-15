package com.vega;

public class Revista extends Recurso {

    private String mes;
    private int edicion;

    public Revista(String id, String titulo, String mes, int edicion) {
        super(id, titulo, TipoRecurso.REVISTA);
        this.mes = mes;
        this.edicion = edicion;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    
    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica(); 
        System.out.println("Mes: " + mes);
        System.out.println("Edición: " + edicion);
    }
    
}
