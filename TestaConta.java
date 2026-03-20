/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flavio.victor
 */
//Q1
public class TestaConta {
    public static void main(String[]args){
        Conta flavio_conta = new Conta();
        flavio_conta.setTitular("flavio");
        System.out.println(flavio_conta.getTitular());
        
        flavio_conta.setNumero(1234);
        System.out.println(flavio_conta.getNumero());
        
        flavio_conta.setAgencia("100");
        System.out.println(flavio_conta.getAgencia());
        
        flavio_conta.setSaldo(900);
        System.out.println(flavio_conta.getSaldo());
        //Q2
        System.out.println(flavio_conta.getDadosConta());
        //Q3
        Conta c1 = new Conta();
        c1.titular = "Danilo";
        c1.setSaldo(100.0);
        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.setSaldo(100.0);
        if (c1==c2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
        //Q4
        Conta c3 = new Conta();
        c3.titular = "Minerva";
        c3.setSaldo(100.0);
        Conta c4 = new Conta();
        c4.titular = "Danilo";
        c4.setSaldo(100.0);
        c3=c4;
        if (c3==c4){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
        System.out.println(c4.getTitular());
    }
                
}
