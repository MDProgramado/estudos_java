package academy.maratonajava.intruducao;


public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * = Operadores simples
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println(" O resultado da operação é "+resultado);

        // % resto usado para descobrir se é par ou impar
        int resto = 20 % 7;
        System.out.println(resto);

        // Operadores logícos ( <,  >,  <=, >=, ==, != )
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 20;
        boolean isDezDiferenteQueDez = 10 != 20;

        System.out.println("IsDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("IsDezMaiorQueVinte " +isDezMenorQueVinte);
        System.out.println("IsDezMaiorQueVinte " +isDezIgualQueVinte);
        System.out.println("IsDezMaiorQueVinte " +isDezIgualQueDez);
        System.out.println("IsDezMaiorQueVinte " +isDezDiferenteQueDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500;
        boolean isDentroDaLei = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario > 3381;
        System.out.println("Maicon esta dentro da lei? " +isDentroDaLei);
        System.out.println("Maicon esta dentro da lei? " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystationCinco = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaPoupanca > valorPlaystationCinco || valorTotalContaCorrente > valorPlaystationCinco;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //Atribuição = Atribuir um valor novo a uma variavél( = += -= *= /= %= )
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus /= 1000;
        bonus *= 1000;
        bonus %= 1000;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; //contador  = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);
    }


}
