package com.uce;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] bingo = new String[5][];

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < bingo.length; i++) {
            bingo[i] = new String[rnd.nextInt(3) + 3];
        }

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                bingo[i][j] = String.valueOf(rnd.nextInt(99) + 1);
            }
        }

        System.out.println(" Tabla de Bingo ");
        System.out.println("---------------------------------");

        for (int turno = 1; turno <= 100; turno++) {

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {
                    System.out.print(bingo[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("---------------------------------");

            System.out.print("\nIngrese su número: ");
            String num = sc.nextLine();

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {
                    if (bingo[i][j].equals(num)) {
                        bingo[i][j] = "X";
                    }
                }
            }

            boolean gano = false;

            for (int i = 0; i < bingo.length; i++) {
                int contadorFila = 0;

                for (int j = 0; j < bingo[i].length; j++) {
                    if (bingo[i][j].equals("X")) {
                        contadorFila++;
                    }
                }

                if (contadorFila == bingo[i].length) {
                    gano = true;
                    break;
                }
            }

            if (gano) {
                System.out.println("B\tI\tN\tG\tO");
                System.out.println("---------------------------------");

                for (int i = 0; i < bingo.length; i++) {
                    for (int j = 0; j < bingo[i].length; j++) {
                        System.out.print(bingo[i][j] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("\nBingoooooooo");
                break;
            }
        }

        sc.close();
    }
}