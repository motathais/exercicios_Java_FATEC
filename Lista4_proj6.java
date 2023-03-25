/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista4_proj6;

import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * 6) Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1 até 10
Ex:
Digite Numero
5
Soma da Tabuada = 275
 */
public class Lista4_proj6 {
    
    
    public static int soma_tabuada(int num){
        
        int soma = 0, i;
        
        for( i = 1; i <= 10; i ++ ){
            
            soma = soma + (num*i);
            
        }
        
        return soma;
    }
    

    public static void main(String[] args) {
        
        int valor;
        
        String x = JOptionPane.showInputDialog(null, "Insira um valor:");
        valor = Integer.parseInt(x);
        
        System.out.printf("A soma de sua tabuada é %d", soma_tabuada(valor));
    }
}
