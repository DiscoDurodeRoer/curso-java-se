package com.mycompany.switch_example;

public class App {

    public static void main(String[] args) {

        int diaSemana = 1;

        // Simple
        switch (diaSemana) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miercoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sabado");
            case 7 ->
                System.out.println("Domingo");
            default ->
                System.out.println("Dia no valido");
        }

        // Agrupado
        switch (diaSemana) {
            case 1, 2, 3, 4, 5 ->
                System.out.println("Laboral");
            case 6, 7 ->
                System.out.println("No laboral");
            default ->
                System.out.println("Dia no valido");
        }

    }
}
