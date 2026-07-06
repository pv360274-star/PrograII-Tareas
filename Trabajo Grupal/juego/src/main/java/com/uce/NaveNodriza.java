package com.uce;

final class NaveNodriza extends NaveAlienigena{

    public NaveNodriza() {
        super("Nave Nodriza", 20);
    }

    public void rayoDestructor(BaseEspacial base){
        System.out.println("¡Alerta! La Nave Nodriza carga su RAYO DESTRUCTOR MASIVO!!");
        base.recibirImpacto(35);
    }

    
    
}
