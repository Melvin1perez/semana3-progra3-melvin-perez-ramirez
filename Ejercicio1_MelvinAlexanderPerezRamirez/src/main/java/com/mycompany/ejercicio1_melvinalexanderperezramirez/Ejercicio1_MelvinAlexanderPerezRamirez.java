/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_melvinalexanderperezramirez;

/**
 *
 * @author melvin
 */
import java.util.Scanner;
public class Ejercicio1_MelvinAlexanderPerezRamirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite una palabra: ");
        String palabra = scanner.next();

        System.out.println("Digite un número: ");
        int veces = scanner.nextInt();

        for (int i = 0; i < veces; i++) {
            System.out.println(palabra);
        }
    }
}



