package com.uce;

public class BaseEspacial {
    private String nombre;
    private int escudo;

    public BaseEspacial(String nombre, int escudo) {
        this.nombre = nombre;
        this.escudo = escudo;
    }

    public void recibirImpacto(int danio){
        this.escudo -= danio;
        if(this.escudo < 0) this.escudo = 0;
        System.out.println(nombre + " recibe " + danio + " de daño. Escudo al " + escudo);
    }

    public void recargarEscudo(int cantidad){
        this.escudo += cantidad;
        if(this.escudo > 100 ) this.escudo = 100;
        System.out.println(nombre + " recarga escudos. Escudo al "  + escudo + "%");
    }

    public boolean estaOperativa(){
        return this.escudo > 0;
    }



    
    
}
