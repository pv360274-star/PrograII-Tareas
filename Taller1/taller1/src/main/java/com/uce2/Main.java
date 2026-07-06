package com.uce2;

public class Main {
    public static void main(String[] args) {

        Curso[][] redAcademias = new Curso[3][];
        redAcademias[0] = new Curso[3];
        redAcademias[0][0] = new Curso("Matemáticas", 18);
        redAcademias[0][1] = new Curso("Física", 25);
        redAcademias[0][2] = new Curso("Química", 20);

        redAcademias[1] = new Curso[6];
        redAcademias[1][0] = new Curso("Matemáticas", 32);
        redAcademias[1][1] = new Curso("Física", 15);
        redAcademias[1][2] = new Curso("Química", 28);
        redAcademias[1][3] = new Curso("Biología", 32);
        redAcademias[1][4] = new Curso("Historia", 32);
        redAcademias[1][5] = new Curso("Geografía", 32);

        redAcademias[2] = new Curso[4];
        redAcademias[2][0] = new Curso("Literatura", 18);
        redAcademias[2][1] = new Curso("Artes", 25);
        redAcademias[2][2] = new Curso("Botánica", 20);
        redAcademias[2][3] = new Curso("Programación", 34);

        System.out.println("--- ESTADO DE LA CADENA DE ACADEMIAS ---");
        String[] nombresSucursales = {"Sucursal A", "Sucursal B", "Sucursal C"};

        for (int i = 0; i < redAcademias.length; i++) {
            System.out.println(" ------ " + nombresSucursales[i] + " ------ ");
            
            for (int j = 0; j < redAcademias[i].length; j++) {
                System.out.println(redAcademias[i][j]);
            }
            System.out.println();
        }

    }
}