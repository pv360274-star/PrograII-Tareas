package com.vega;

public class Libro extends Recurso {

    private String autor;
    private int paginas;

    public Libro(String id, String titulo, String autor, int paginas) {
        super(id, titulo, TipoRecurso.LIBRO);
        this.autor = autor;
        this.paginas = paginas;
    }

     public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica(); 
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
    
}
