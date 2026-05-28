package com.uce;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {String [][] bingo = new String [5][5];
        Scanner sc = new Scanner(System.in);

        boolean[] usados = new boolean[100]; 
        
        for(int i=0; i<bingo.length; i++){
            for(int j=0; j<bingo[i].length; j++){
                int numeroAleatorio;

                do {
                    numeroAleatorio = (int)(Math.random() * 100);
                } while (usados[numeroAleatorio] == true);
                
                usados[numeroAleatorio] = true;
                bingo[i][j] = String.valueOf(numeroAleatorio);
            }
        }

        System.out.println("---------- Tabla de Bingo ----------");
        for(int i=0; i<bingo.length; i++){
            for(int j=0; j<bingo[i].length; j++){
                System.out.print(bingo[i][j] + "\t");
            }
            System.out.println();
        }

        while(true){
            System.out.println("Ingrese una fila:");
            int fila = sc.nextInt();
            if(fila == -1){
                break;
            }
            
            System.out.println("Ingrese una columna:");
            int columna = sc.nextInt();

            if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
                bingo[fila][columna] = "x";
            } else {
                System.out.println("Ese índice no existe. Solo usa números del 0 al 4.");
                continue; 
            }
            
            System.out.println("---------- Tabla de Bingo ----------");
            for(int i=0; i<bingo.length; i++){
                for(int j=0; j<bingo[i].length; j++){
                    System.out.print(bingo[i][j] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}