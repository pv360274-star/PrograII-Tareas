package com.uce2;

import java.util.Random;

public class Curso {
    private final String nombre;
    private final int capacidadMaxima;
    private final int inscritos;

    public Curso(String nombre, int inscritosIniciales) {
        this.nombre = nombre;

        Random rand = new Random();
        this.capacidadMaxima = rand.nextInt(16) + 20; 

        if (inscritosIniciales > this.capacidadMaxima) {
            System.out.println("El número de alumnos no puede exceder a " + this.capacidadMaxima);
            this.inscritos = this.capacidadMaxima;
        } else {
            this.inscritos = inscritosIniciales;
        }
    }

    @Override
    public String toString() {
        return "Curso: [" + nombre + "], Inscritos: [" + inscritos + "], Capacidad Máxima: [" + capacidadMaxima + "]";
    }

}
