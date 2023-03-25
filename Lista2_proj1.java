/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_proj1;

/**
 *
 * @author thais
 * 1 - Ler um valor e informar se ele é ou não múltiplo de 3.
 */

import javax.swing.JOptionPane;


public class Lista2_proj1 {

    public static void main(String[] args) {
        
    String valor = JOptionPane.showInputDialog("Informe um valor: ");
    
    int num = Integer.parseInt(valor);
    
    if(num % 3 == 0){
        
        JOptionPane.showMessageDialog(null, "O numero " + num + " é multiplo de 3");
    }
    else {
        
        JOptionPane.showMessageDialog(null, "O numero " + num + " não é multiplo de 3");
    }
      
    }
}
