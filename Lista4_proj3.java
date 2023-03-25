/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista4_proj3;

import javax.swing.JOptionPane;

/**
 *
 * @author motamt
 * 
 * 3) Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de um  triângulo ,  através  de  uma  funçãoque  retorne  valor, 
 * e,  se  forem  verificar  se  é  um triângulo equilátero, isósceles ou escalenos.
 * Se eles não formarem um triângulo, escrever a mensagem. Considere as seguintes propriedades:
 * • O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados;
 * • Equiláteros: tem os comprimentos dos três lados iguais;
 * • Isósceles: tem os comprimentos de dois lados iguais;
 * • escaleno: tem os comprimentos dos três lados diferentes
 */
public class Lista4_proj3 {
    
        
        public static void Eh_triangulo( int a, int b, int c){
        
            if (a < b + c && b < a + c && c < a + b){
                
                if( a == b && a == c){
                    System.out.println("É um triângulo equilátero!");
                }
                else{
                    if(a != b && a != c){
                        System.out.println("É um triângulo escaleno!");
                    }
                    else{
                        System.out.println("É um triângulo isósceles!");
                    }
                }
            }
            else{
                System.out.println("Não é um triângulo!");
            } 
    }
    
   public static void main(String[] args) {
        
        int l1, l2 ,l3;
        
        String x = JOptionPane.showInputDialog(null,"Insira o valor 1");
        l1 = Integer.parseInt(x);
        
        String y = JOptionPane.showInputDialog(null,"Insira o valor 2");
        l2 = Integer.parseInt(y);
        
        String z = JOptionPane.showInputDialog(null,"Insira o valor 3");
        l3 = Integer.parseInt(z);
        
        Eh_triangulo(l1,l2,l3);
       
    }

       
}

    
