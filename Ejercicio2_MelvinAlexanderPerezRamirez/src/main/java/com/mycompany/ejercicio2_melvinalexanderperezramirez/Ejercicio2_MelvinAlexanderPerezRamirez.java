/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_melvinalexanderperezramirez;

/**
 *
 * @author melvin
 */
import java.util.Scanner;
public class Ejercicio2_MelvinAlexanderPerezRamirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer valor: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite el segundo valor: ");
        double n2 = scanner.nextDouble();

        double suma = n1 + n2;
        double resta = n1 - n2;
        double multiplicacion = n1 * n2;
        double division = n1 / n2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
