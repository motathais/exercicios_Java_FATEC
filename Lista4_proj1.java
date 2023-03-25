/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista4_proj1;

import javax.swing.JOptionPane;

/**
 * @author motamt
 * 1) Ler o nome de um produto, o preço e a quantidade comprada. Escreva o nome do 
produto comprado e o valor total a ser pago, considerando que são oferecidos descontos 
pelo número de unidades compradas, segundo a tabela abaixo:
a) Até 10 unidades: valor total
b) De 11 a 20 unidades: 10% de desconto
c) De 21 a 50 unidades: 20% de desconto
d) Acima de 50 unidades: 25% de desconto
Calcular o valor total a ser pago através de uma função que retorna valor.
 */

public class Lista4_proj1 {
    
   public class Metodo_ex1 {
    
   public static double valor_total(double preco, double unid){
    
        if(unid <= 10){
            return(unid*preco);
        }
        else{
            if(unid <= 20){
                return(unid*preco*0.9);
            }
            else{
                if(unid <=50){
                    return(unid*preco*0.8);
                }
                else{
                    return(unid*preco*0.75);
                }
            }
                    
        }     
    } 

        public static void main(String[] args) {
        
        double x, y, z;
        
        String nome = JOptionPane.showInputDialog(null,"Insira o nome do produto:");
        
        String valor = JOptionPane.showInputDialog(null,"Insira o valor do produto:");
        x = Integer.parseInt(valor);
        
        String qtde = JOptionPane.showInputDialog(null,"Insira a quantidade do produto:");
        y = Integer.parseInt(qtde);
        
        z= valor_total(x,y);
        
        System.out.printf("O valor total a ser pago do produto %s é %.2f", nome,z);
        
        }  
    }
}

