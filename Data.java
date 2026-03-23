/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Data {

    int dia;
    int mes;
    int ano;

    public void preencheData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String formatada(){
        /*
        Q8.
        */
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
