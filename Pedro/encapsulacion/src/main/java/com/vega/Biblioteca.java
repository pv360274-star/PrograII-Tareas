package com.vega;
import java.util.List;
import java.util.ArrayList;
public class Biblioteca {

    private List<Recurso> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>(); 
    }

    public void registrarRecurso(Recurso r) {
        inventario.add(r);
    }

    public void filtrarPorTipo(TipoRecurso tipo) {
        System.out.println("\n--- Recursos del tipo: " + tipo + " ---");
        for (Recurso r : inventario) {
            if (r.getTipo() == tipo) {
                r.mostrarFichaTecnica();
            }
        }
    }

    public Recurso buscarPorId(String id) {
        for (Recurso r : inventario) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null; 
    }

    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO COMPLETO ===");
        for (Recurso r : inventario) {
            r.mostrarFichaTecnica();
        }
    }
    
}
