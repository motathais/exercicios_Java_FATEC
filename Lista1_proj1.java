/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1_proj1;

/**
 *
 * @author thais
 * 1- Faça um programa que leia dois valores e informe a média entre eles. (use float 
como tipo de dado)
 */

import java.util.Scanner;


public class Lista1_proj1 {

    public static void main(String[] args) {
        
        int v1, v2, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o valor 1:");
        
        v1 = entrada.nextInt();
        
        System.out.println("Insira o valor 2:");
        
        v2 = entrada.nextInt();
        
        media = (v1 + v2)/2;
                
        System.out.printf("A média de %d e de %d é %d\n", v1, v2, media);
    }
}
