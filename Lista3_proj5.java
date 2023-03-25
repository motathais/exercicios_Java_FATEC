/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista3_proj5;

import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * 
 * Criar um programa que leia um número que será o limite superior de um intervalo e o incremento. 
 * Exibir todos os números naturais no intervalo de 0 até esse número.
 * Suponha que os dois números lidos são maiores que zero.
 * Exemplo:Limite superior: 20Incremento: Saída: 0  5  10  15  20
 */
public class Lista3_proj5 {

    public static void main(String[] args) {
        String x, y;
        int lim, incr, i;
    try{
        x = JOptionPane.showInputDialog("Insira o valor limite do intervalo: ");
        lim = Integer.parseInt(x);
        
        y = JOptionPane.showInputDialog("Insira o incremento: ");
        incr = Integer.parseInt(y);
        
        for(i = 0; i <= lim; i = i + incr ){
          
            System.out.println(i);
            
        } 
    }   
    catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"O dado inserido deve ser numérico!");
    }
    }
}
