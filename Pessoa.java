/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author thais
 * 3ª) Criar uma classe Pessoa com as seguintes características: 
• atributos: idade e dia, mês e ano de nascimento, nome da pessoa 
• métodos: 
o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e 
armazena no atributo idade a idade atual da pessoa; 
o informaIdade(), que retorna o valor da idade 
o informaNome(), que retorna o nome da pessoa 
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como 
parâmetros e preenche nos atributos correspondentes do objeto. 
• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643) 
• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam 
as idades de Einstein e Newton caso estivessem vivos
 */

public class Pessoa {
    
    int idade, dia, mes, ano;
    String nome;
    
    Date data = new Date();
    
    LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
    int ano_atual = localDate.getYear();
    int mes_atual = localDate.getMonthValue();
    int dia_atual = localDate.getDayOfMonth();
    
    public void setValores(int id, String name){
       idade = id;
       nome = name;
    }
    
    public void ajustaDataDeNascimento(int d, int m, int a)
    {
        dia = d;
        mes = m;
        ano = a;      
    }
    
 
    public int calculaIdade(){
          
       if(mes_atual >= mes){
           if(dia_atual >= dia){
               idade = ano_atual - ano;
           }
           else{
               idade = ano_atual - ano - 1;
           }
       }
       else{
           idade = ano_atual - ano - 1;
       }
       return idade;
    }
      
     /*public int informaIdade(){
          return idade;
      }
    */
    
      public String informaNome(){
          return nome;
      }
      
        
      Pessoa(){
        dia= 0;
        mes = 0;
        ano = 0;
        idade = 0;
        nome = "";
        
    } 
        
    public static void main(String[] args) {
       
        
    try{    
    Pessoa Isaac_Newton = new Pessoa();
    
    Isaac_Newton.ano = 1643;
    Isaac_Newton.mes = 1;
    Isaac_Newton.dia = 4;
    Isaac_Newton.nome = "Isaac Newton";
    
    JOptionPane.showMessageDialog(null, "Se " + Isaac_Newton.nome + " estivesse vivo, sua idade seria " + Isaac_Newton.calculaIdade() + " anos.");
    
    Pessoa Albert_Einstein = new Pessoa();
    
    Albert_Einstein.ano = 1879;
    Albert_Einstein.mes = 3;
    Albert_Einstein.dia = 14;
    Albert_Einstein.nome = "Albert Einstein";
    
    JOptionPane.showMessageDialog(null, "Se " + Albert_Einstein.nome + " estivesse vivo, sua idade seria " + Albert_Einstein.calculaIdade() + " anos.");
    }
    catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"As entradas de dia, mes e ano devem ser numéricas!");
        }
    }
    
}
