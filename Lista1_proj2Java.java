/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1_proj2.java;

/**
 *
 * @author thais
 *2- Faça um programa que leia uma temperatura em graus Centígrados e 
apresente-a convertida em graus Fahrenheit. A fórmula de conversão é: 
F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus 
Centígrados.
 */

import java.util.Scanner;


public class Lista1_proj2Java {

    public static void main(String[] args) {
        
        int f, c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em graus Centígrados:");
        
        c = entrada.nextInt();
        
        f = (9*c + 160) /5;
        
        System.out.printf("O valor de %d graus Centigrados em Fahrenheit é: %d\n", c, f);
    }
}
