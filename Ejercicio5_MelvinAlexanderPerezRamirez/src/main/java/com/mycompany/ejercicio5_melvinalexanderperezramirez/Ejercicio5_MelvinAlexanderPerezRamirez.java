/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_melvinalexanderperezramirez;

/**
 *
 * @author melvin
 */
import java.util.Scanner;

public class Ejercicio5_MelvinAlexanderPerezRamirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;

        System.out.println("El área de la circunferencia es: " + area);
    }
}
