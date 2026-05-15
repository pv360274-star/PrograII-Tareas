package com.vega;

public class Main {
    public static void main(String[] args) {

        Biblioteca miBiblioteca = new Biblioteca();
 
        Libro libro1 = new Libro("1001", "Cien años de soledad", "Gabriel García Márquez", 471);

        Revista revista1 = new Revista("R001", "National Geographic", "Mayo", 245);

        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);

        miBiblioteca.mostrarInventario(); 
        miBiblioteca.filtrarPorTipo(TipoRecurso.REVISTA); 

        System.out.println("\nBuscando recurso 1001...");
        Recurso encontrado = miBiblioteca.buscarPorId("1001");
        
        if (encontrado != null) {
            System.out.println("Resultado de búsqueda: " + encontrado.getTitulo());
        }
    }
}