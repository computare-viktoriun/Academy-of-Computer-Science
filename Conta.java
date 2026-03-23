/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Conta {

    String titular;
    private int numero;
    private String agencia;
    private double saldo;

    public Conta(){
        /*
        Q7. Faça com que sua classe Conta possa receber, opcionalmente, o nome do titular da
        Conta durante a criação do objeto. Utilize construtores para obter esse resultado.
        Dica: utilize um construtor sem argumentos também, pensando no caso em que a
        pessoa não queira passar o titular da Conta. Na classe Conta seria algo assim:
        */
    }
    
    public Conta(String titular){
        this.titular = titular;
    }
    
    Data dataDeAbertura = new Data();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRedimento() {
        return this.saldo * 0.1;
    }

    /*
        Q2. Na classe Conta, modifique o método getDadosConta() que não recebe parâmetro,
        mas devolve o texto com todas as informações da nossa conta para efetuarmos a
        impressão. Dessa maneira, você não precisa ficar copiando e colando um monte de
        System.out.println() para cada mudança e teste que fizer com os seus funcionários,
        você simplesmente fará:
        
     */

    public String getDadosConta() {
        /*
        Q6. Modifique seu método getDadosConta para que ele devolva o valor da
        dataDeAbertura daquela Conta
        */
        String dados = "Titular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }
}
