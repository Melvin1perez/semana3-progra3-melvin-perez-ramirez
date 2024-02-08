/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_melvinalexanderperezramirez;

/**
 *
 * @author melvin
 */
import java.util.Scanner;

public class Ejercicio3_MelvinAlexanderPerezRamirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor número es: " + mayor);
    }
}
