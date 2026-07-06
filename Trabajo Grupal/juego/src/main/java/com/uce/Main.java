package com.uce;

import java.util.Scanner;

public class Main {

    static{
        System.out.println("=====================================================");
        System.out.println(" DEFENSA GALÁCTICA: COMANDO ESTELAR");
        System.out.println(" Protege la base de las oleadas aliennígenas");
        System.out.println("=====================================================");
    }
    public static void main(String[] args) {       
        BaseEspacial miBase = new BaseEspacial("Estacion Alfa", 100);
        Scanner sc= new Scanner(System.in);

        NaveAlienigena [][] oleadas = new NaveAlienigena[3][];
        oleadas[0] = new NaveAlienigena[2];
        oleadas[1] = new NaveAlienigena[3]; 
        oleadas[2] = new NaveAlienigena[4];

        oleadas[0][0] = new CazaLigero();
        oleadas[0][1] = new CazaLigero();

        oleadas[1][0] = new CazaLigero();
        oleadas[1][1] = new CazaLigero();
        oleadas[1][2] = new NaveNodriza();

        oleadas[2][0] = new CazaLigero();
        oleadas[2][1] = new CazaLigero();
        oleadas[2][2] = new NaveNodriza();
        oleadas[2][3] = new NaveNodriza();

        for(int i=0; i < oleadas.length; i++){
            System.out.println("[SISTEMA] Presiona ENTER para iniciar la oleada " + ( i+1 ) + " ... ");
            sc.nextLine();
            System.out.println("----------- DETECTANDO OLEADA " + (i+1) + " -------------");
            for(int j=0 ; j< oleadas[i].length; j++){
                if(!miBase.estaOperativa())break;
                NaveAlienigena enemiga = oleadas[i][j];

                if(enemiga instanceof NaveNodriza){
                    NaveNodriza nodriza = (NaveNodriza) enemiga;
                    nodriza.rayoDestructor(miBase);

                }else{
                    enemiga.atacar(miBase);
                }

            }

        if(i == 1 && miBase.estaOperativa()){
            System.out.println("¡Un satélite aliado envía una cápsula de recarga!");
            Mejora capsula = new Mejora(){
                @Override
                public void aplicarMejora(BaseEspacial base){
                    System.out.println("Desplegando nanobots de reparación...");
                    base.recargarEscudo(40);

                }
            };
            capsula.aplicarMejora(miBase);

        }

        }

        System.out.println("=====================================================");
        if(miBase.estaOperativa()){
            System.out.println("¡VICTORIA! La Estación Alfa ha sobrevivido.");

        }else{
            System.out.println("LA BASE HA SIDO DESTRUIDA. FIN DE LA TRANSMISIÓN");
        }

        System.out.println("=====================================================");
        sc.close();


        
   }
}