package com.vega;
public class Recurso {
    private String id;
    private String titulo;
    private TipoRecurso tipo;
    private boolean disponible;

    public Recurso(String id, String titulo, TipoRecurso tipo) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.disponible = true; 
    }

     public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoRecurso getTipo() {
        return tipo;
    }

    public void setTipo(TipoRecurso tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarFichaTecnica() {
        System.out.println("----------------------------------------");
        System.out.println("[" + tipo + "] ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
    }
}



   