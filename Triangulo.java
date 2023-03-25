/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * 1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um 
triângulo. Na classe definir um método para leitura da base e altura, um método construtor 
e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar 
e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto 
criado.
 */

public class Triangulo {
    
    // Atributos da Classe Triangulo
float base, altura, area;


// Metodo para leitura da base e da altura

public void SetBaseAltura(float b, float a)
{
base = b;
altura = a;
}
    
 // Metodo para Calculo da Área

public float GetArea()
{
area = (base * altura)/2;
return area;
}
// Construtor da Área

Triangulo(){
base = 0;
altura = 0;
area = 0;
}
   
    
public static void main(String[] args) {
    float b1, h;

    try{
    String v1=JOptionPane.showInputDialog("Informe a base:");
    String v2=JOptionPane.showInputDialog("Informe a altura:");

    b1 = Float.parseFloat(v1);
    h = Float.parseFloat(v2);

    Triangulo t1 = new Triangulo();
    t1.SetBaseAltura(b1,h); 

    JOptionPane.showMessageDialog(null,"A area é " + t1.GetArea());
    }
    
    catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"As entradas de base e altura devem ser numéricas!");
        }
    }
}
