package com.uce;

import java.util.Random;

abstract sealed class NaveAlienigena permits CazaLigero, NaveNodriza{
    protected String modelo;
    protected int poderFuego;
    protected int idRadar;

    {
        Random rand = new Random();
        idRadar = rand.nextInt(9000) + 1000;
    }

    public NaveAlienigena(String modelo, int poderFuego) {
        this.modelo = modelo;
        this.poderFuego = poderFuego;
    }

    public void atacar(BaseEspacial base){
        System.out.println("Nave [ " + idRadar + " ] " + modelo + "dispara sus cañones! ");
        base.recibirImpacto(poderFuego);
    }

    
}
