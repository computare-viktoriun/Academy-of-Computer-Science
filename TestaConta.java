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
public class TestaConta {

    public static void main(String[] args) {
        Conta flavio_conta = new Conta();
        flavio_conta.setTitular("flavio");
        System.out.println(flavio_conta.getTitular());

        flavio_conta.setNumero(1234);
        System.out.println(flavio_conta.getNumero());

        flavio_conta.setAgencia("100");
        System.out.println(flavio_conta.getAgencia());

        flavio_conta.setSaldo(900);
        System.out.println(flavio_conta.getSaldo());
        /*
        Q2. Na classe Conta, modifique o método getDadosConta() que não recebe parâmetro,
        mas devolve o texto com todas as informações da nossa conta para efetuarmos a
        impressão. Dessa maneira, você não precisa ficar copiando e colando um monte de
        System.out.println() para cada mudança e teste que fizer com os seus funcionários,
        você simplesmente fará:
        
        */
        System.out.println(flavio_conta.getDadosConta());
        /*
        Q3. Na classe de teste dentro do bloco main, construa duas contas com o new e
        compare-as com o ==. E se elas tiverem os mesmos atributos? Para isso, você
        precisará criar outra referência:
        
        Em ambos os casos, temos false como resposta. Porque?
        */
        Conta c1 = new Conta();
        c1.titular = "Danilo";
        c1.setSaldo(100.0);
        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.setSaldo(100.0);
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        /*
        Q4. Agora crie duas referências à mesma conta e compare-as com o ==. Tire suas
        conclusões. Para criar duas referências à mesma conta adicione o comando abaixo
        antes do if:
        
        c1 = c2;
        
        O que acontece com o if do exercício anterior? Verifique: mude o titular da c1 para
        “Minerva” e imprima c2.titular.
        */
        Conta c3 = new Conta();
        c3.titular = "Minerva";
        c3.setSaldo(100.0);
        Conta c4 = new Conta();
        c4.titular = "Danilo";
        c4.setSaldo(100.0);
        c3 = c4;
        if (c3 == c4) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        System.out.println(c4.getTitular());
        
        
        /*
        Q5. 
        */
        
        Conta c5 = new Conta();
        c5.setTitular("Minerva");
        c5.setAgencia("1234");
        c5.setNumero(223);
        c5.setSaldo(50);
        c5.deposita(100);
        System.out.println(c5.getDadosConta());
        
        /*
        Q6. Modifique seu método getDadosConta para que ele devolva o valor da
        dataDeAbertura daquela Conta:
        */
    }

}
