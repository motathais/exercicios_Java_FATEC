/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista3_proj2;

import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série:
1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8
 */
public class Lista3_proj2 {

    public static void main(String[] args) {
       
        try{
        String valor = JOptionPane.showInputDialog(null,"Digite a quantidade de números da sequência Fibonacci a ser impressa:");
        
        int n = Integer.parseInt(valor);
        int i, fib[];
        
        fib = new int[n];
        
        for (i = 0; i < n; i++ ){
            
            if(i == 0 || i == 1){
                fib[i] = 1;
            }
            else{
                fib[i] = fib[i-1]+ fib[i-2];
            }
            
            System.out.println(fib[i]);
        }
    }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O dado precisa ser apenas numérico!","ERRO :",1);
        }
    }
}

