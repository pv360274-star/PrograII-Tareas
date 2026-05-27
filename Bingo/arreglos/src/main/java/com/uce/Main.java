package com.uce;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] bingo = new String[5][5];
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        // 1. Llenar matriz con números aleatorios (1 al 99)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = String.valueOf(rnd.nextInt(99) + 1);
            }
        }

        System.out.println(" Tabla de Bingo ");
        System.out.println("---------------------------------");
        for (int turno = 1; turno <= 25; turno++) {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
    
                    System.out.print(bingo[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("---------------------------------");

            System.out.print("\nIngrese su número: ");
            String num = sc.nextLine();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bingo[i][j].equals(num)) {
                        bingo[i][j] = "X";
                    }
                }
            }

            boolean gano = false;
            for (int i = 0; i < 5; i++) {
                int contadorFila = 0;
                int contadorCol = 0;
                
                for (int j = 0; j < 5; j++) {
                    if (bingo[i][j].equals("X")) contadorFila++;
                    if (bingo[j][i].equals("X")) contadorCol++;
                }
                
                if (contadorFila == 5 || contadorCol == 5) {
                    gano = true;
                }
            }

            if (gano) {
                System.out.println("B\tI\tN\tG\tO");
                System.out.println("---------------------------------");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(  bingo[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\n Bingoooooooo");
                break; 
            }
        }
        sc.close();
    }
}