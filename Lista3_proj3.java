/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
3)Um  programa  capaz  de  imprimir  todos  os  números  primos  em  um  intervalo  de números informado pelo usuário;
*/

package com.mycompany.lista3_proj3;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author thais
 */
public class Lista3_proj3 {

    public static void main(String[] args) {
      String v1, v2;
      int ini, fim, i, j;
      boolean primo;
      
      ArrayList vet = new ArrayList<Integer>();
      
      
    try {
        
        v1 = JOptionPane.showInputDialog("Inserir o inicio do intervalo: ");
        v2 = JOptionPane.showInputDialog("Inserir fim do intervalo:");
        
        ini = Integer.parseInt(v1);
        fim = Integer.parseInt(v2);
        
        if(ini >= fim){
            throw new Exception("IntervaloIncorreto");
        }
        
        for( i = ini ; i <= fim; i ++){
            
            if( i < 2){
                primo = false;
            }else{
                primo = true;
                
              for (j = 2; j <= i/2 + 1; j ++ ){
              if ( i% j == 0){
                    primo = false;
                    break;
                }      
            }
        }
         if(primo){
             vet.add(i);
         }   
         
        }
        System.out.println(vet);
    }
    
    catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O dado inserido tem que ser apenas numérico!");
        }
    catch(Exception IntervaloIncorreto){
            JOptionPane.showMessageDialog(null,"Início do intervalo NÃO PODE SER MAIOR OU IGUAL ao fim do intervalo!");
        }

    }
    
}