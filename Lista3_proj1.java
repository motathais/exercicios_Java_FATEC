/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista3_proj1;

import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * Um  programa  capaz  de  imprimir  todos  os  números  pares  em  um  intervalo de números informador pelo usuário;
 */
public class Lista3_proj1 {

    public static void main(String[] args) {
        
        try{
            
        String v1 = JOptionPane.showInputDialog("Informe o inicio do intervalo: ");
        String v2 = JOptionPane.showInputDialog("Informe o fim do intervalo: ");
       
        int menor = Integer.parseInt(v1);
        int maior = Integer.parseInt(v2);
        int i;
        
        if (menor > maior){
            throw new Exception("Nova_Exceção");
        }
            

        for(i = menor; i <= maior; i ++){
            
            if(i % 2 == 0){
                
            }
        }
      }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"O dado precisa ser apenas numérico!","ERRO :",1);
        }
        catch(Exception Nova_Exceção){
           JOptionPane.showMessageDialog(null,"O valor inicial não pode ser maior que o valor final!","ERRO :",1); 
        }
        }
    }

