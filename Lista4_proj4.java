/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista4_proj4;

import javax.swing.JOptionPane;

/**
 *
 * @author motamt
 4) Calcule o peso ideal de uma pessoa através de uma função que não retorne valor. Dados 
de entrada: altura e sexo. Fórmulas para cálculo do peso:
peso ideal de homem = (72,7 x altura) - 58
peso ideal da mulher = (62,1 x altura) - 44,
* 
*/
public class Lista4_proj4 {

    public static void peso_ideal(double altura, String sexo){
        
         double p_ideal;
         String m = "M";
         String f = "F";
        
        if(sexo.equals(m)){
           p_ideal = (altura * 72.7) - 58;
           System.out.printf("O peso ideal é %.2f ", p_ideal);
           
        }
        else{
            if (sexo.equals(f)){
                p_ideal = (altura * 62.1) - 44;
                System.out.printf("O peso ideal é %.2f ", p_ideal);
            }
            else{
                System.out.printf("Erro");
                //tratamento de erro;
            }
        } 
    }
    
    public static void main(String[] args) {
        
        double alt;
        
        String x = JOptionPane.showInputDialog(null,"Insira a altura ");
        alt = Double.parseDouble(x);
        
        String s = JOptionPane.showInputDialog(null,"Insira M para sexo maculino e F para Feminino: ");
       
        
       peso_ideal(alt, s);
    }
}
