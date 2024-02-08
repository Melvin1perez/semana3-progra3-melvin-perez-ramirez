/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4_melvinalexanderperezramirez;

/**
 *
 * @author melvin
 */
import java.util.Scanner;
public class Ejercicio4_MelvinAlexanderPerezRamirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el largo del rectángulo: ");
        double largo = scanner.nextDouble();

        System.out.println("Digite el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        double perimetro = 2 * largo + 2 * ancho;
        double area = largo * ancho;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }
}
