/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flavio.victor
 */

/*
Q1. Crie a classe Conta com os getters e setters necessários da sua classe e os métodos
sca, deposita, calculaRendimento e getDadosConta. Adicione o modificador de
visibilidade (private, se necessário) para cada atributo(titular, numero, agencia e
saldo) e método da classe Conta. Crie uma classe TestaConta nela crie uma
referência a um objeto do tipo Conta no método main e tente modificar ou ler um
de seus atributos privados. O que acontece?
*/
public class Conta {
    String titular;
    private int numero;
    private String agencia;
    private double saldo;
    
    Data dataDeAbertura = new Data();
    
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
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public double calculaRedimento(){
        return this.saldo * 0.1;
    }
    /*
        Q2. Na classe Conta, modifique o método getDadosConta() que não recebe parâmetro,
        mas devolve o texto com todas as informações da nossa conta para efetuarmos a
        impressão. Dessa maneira, você não precisa ficar copiando e colando um monte de
        System.out.println() para cada mudança e teste que fizer com os seus funcionários,
        você simplesmente fará:
        
    */
    public String getDadosConta(){
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMês: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        return dados;
    }
    
}
