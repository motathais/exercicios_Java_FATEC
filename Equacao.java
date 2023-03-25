/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equacao;

import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * 2ª) Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A, 
B e C. Na classe definir um método para leitura dos valores, um método construtor e um 
método para calcular as raízes da equação.
R1 = (-b+ (raiz de delta)) / (2*a)
R2 = (-b-(raiz de delta)) / (2*a)
Considerar que:
- Se delta = 0, as raízes são iguais;
- Se delta <0, não existem raízes reais;
- Se delta >0, existem 2 raízes diferentes
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar 
e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
 */

public class Equacao {
    double a, b, c, raiz1, raiz2, delta;
    
    //metodo para leitura dos valores
    public void SetValores(double v1, double v2, double v3){
        
        a = v1;
        b = v2;
        c = v3;
    }
    
    //metodo para calculo do delta
    
    public double GetDelta(){
        delta = Math.pow(b, 2)-4*a*c;
        
        return delta;
    }
    
    //metodo para Calculo das raízes
    
    public double GetRaiz1(){
        raiz1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        
        return raiz1;
    }
    
    public double GetRaiz2(){
        raiz2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        
        return raiz2;
    }
    
    Equacao(){
    a= 0;
    b = 0;
    c = 0;
    raiz1= 0;
    raiz2= 0;
    delta = 0;
    }

    public static void main(String[] args) {
        double n1, n2, n3;
        
    try{
        
    String v1 =JOptionPane.showInputDialog("Informe o valor A:");
    String v2 =JOptionPane.showInputDialog("Informe o valor B:");
    String v3 =JOptionPane.showInputDialog("Informe o valor C:");
    
    n1 = Double.parseDouble(v1);
    n2 = Double.parseDouble(v2);
    n3 = Double.parseDouble(v3);

     Equacao eq1 = new Equacao();
     eq1.SetValores(n1, n2, n3);
     
     if(eq1.GetDelta() <0){
         
         JOptionPane.showMessageDialog(null, "A equação não possui raizes reais!");
     }else{
         
         if(eq1.GetDelta() == 0){
             JOptionPane.showMessageDialog(null,"O valor de delta é 0. Raiz única: " + eq1.GetRaiz1());
         }
         else{
            JOptionPane.showMessageDialog(null,"Duas raízes reais!");
            JOptionPane.showMessageDialog(null,"A raiz 1 é: " + eq1.GetRaiz1());
            JOptionPane.showMessageDialog(null,"A raiz 2 é: " + eq1.GetRaiz2());
         }
     }
          
    }
    catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"As entradas de A, B e C devem ser numéricas!");
        }
    } 
}
