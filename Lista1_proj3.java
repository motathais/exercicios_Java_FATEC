/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1_proj3;

/**
 *
 * @author thais
 * 3- Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a 
fórmula:
* 
* VOLUME = 3.14159 * R2 * ALTURA
 */

import java.util.Scanner;

public class Lista1_proj3 {

    public static void main(String[] args) {
        
    double v, r, h;
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe o raio:");
    
    r = entrada.nextDouble();
    
    System.out.println("Informe a altura:");
    
    h = entrada.nextDouble();
       
    v =  3.14159* Math.pow(r,2)*h;
     
    System.out.printf("O volume é: %2.2f", v);
    
    }
}
