/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_proj2;

/**
 *
 * @author thais
 * 2 - Ler três números e mostrá-los em ordem crescente.
 */

import javax.swing.JOptionPane;

public class Lista2_proj2 {

    public static void main(String[] args) {
        
        String v1 = JOptionPane.showInputDialog("Informe o valor 1: ");
        String v2 = JOptionPane.showInputDialog("Informe o valor 2: ");
        String v3 = JOptionPane.showInputDialog("Informe o valor 3: ");
        
        int num1 = Integer.parseInt(v1);
        int num2 = Integer.parseInt(v2);
        int num3 = Integer.parseInt(v3);

        int maior, meio, menor;
        
        if((num1 == num2) || (num1 == num3) || (num2 == num3) || ((num1 == num2) && (num2 == num3))){
            JOptionPane.showMessageDialog(null, "Não podem haver numeros iguais!");
        }
        else{
        
        
        if(num1 > num2 && num1 > num3){
            maior = num1;
            
            if(num2 > num3){
                meio = num2; 
                menor = num3;
            }
            else{
                meio = num3; 
                menor = num2;
            }
            
        }
        else{
            if (num2 > num3 && num2 > num1){
              maior = num2;
              
              if(num1 > num3){
                meio = num1; 
                menor = num3;
            }
            else{
                meio = num3; 
                menor = num1;
            }
                
            }
            else{
             maior = num3;
             
             if(num1 > num2){
                meio = num1;
                menor = num2;
            }
             else {
                meio = num2;
                menor = num1;
             }
             }
            }
        
        JOptionPane.showMessageDialog(null, "A ordem crescente é: "+ menor + " "+ meio+ " " + maior);
        }
    }
 }

