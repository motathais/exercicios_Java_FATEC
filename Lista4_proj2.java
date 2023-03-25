/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista4_proj2;

import javax.swing.JOptionPane;

import static com.mycompany.lista4_proj2.Metodo_ex2.saldo_atual;

/**
 * @author motamt
 *  Ler número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o 
saldo atual (saldo atual = saldo - débito + crédito), através de uma função que retorne 
valor, também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo 
Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */

public class Lista4_proj2 {

    public static void main(String[] args) {
        
    float saldo, debito, credito, saldo_at;
        
     String a = JOptionPane.showInputDialog(null,"Informe o número da conta:");
     
     String x = JOptionPane.showInputDialog(null,"Informe o saldo:");
     saldo = Integer.parseInt(x);
     
     String y = JOptionPane.showInputDialog(null,"Informe o débito:");
     debito = Integer.parseInt(y);
      
     String z = JOptionPane.showInputDialog(null,"Informe o crédito:");
     credito = Integer.parseInt(z);
     
     saldo_at = saldo_atual(saldo,debito,credito);
     
     System.out.printf("O saldo atual da conta %s é %.2f \n",a, saldo_at);
     
     if (saldo_at < 0){
         System.out.println("Saldo Negativo");
     }
     else{
         System.out.println("Saldo Positivo");
     }
     
    }
}
