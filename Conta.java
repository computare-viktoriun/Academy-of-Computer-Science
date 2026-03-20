/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flavio.victor
 */
public class Conta {
    String titular;
    private int numero;
    private String agencia;
    private double saldo;
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getAgencia(){
        return agencia;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
         
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }            
            
    public void saca(double valor) {}
    
    public void deposita(double valor){}
    
    public double calculaRedimento(){
        return this.saldo * 0.1;
    }
    
    public String getDadosConta(){
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        return dados;
    }
}
