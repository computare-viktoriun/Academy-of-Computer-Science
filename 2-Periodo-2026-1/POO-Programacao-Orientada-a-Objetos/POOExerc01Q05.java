public class Exercicio05 {
    public static void main(String[] args)  {
    
        /**
        * 5. No código do exercicio anterior, aumente a quantidade de números que terão os fatoriais até 20,30 e 40.
        * Em um determinado momento, além de esse cálculo demorar, começará a mostrar respostas completamente erradas. Por quê?
        * Mude de int para long a fim de ver alguma mudança.
        */
        
        long fatorial = 1;
        for(long n = 1; n <= 30; n++) {
            fatorial = (fatorial*n);
            System.out.println(fatorial);
        }
    }
    
}
