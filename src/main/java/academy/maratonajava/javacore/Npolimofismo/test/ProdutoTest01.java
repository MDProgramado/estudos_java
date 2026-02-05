package academy.maratonajava.javacore.Npolimofismo.test;

import academy.maratonajava.javacore.Npolimofismo.dominio.Computador;
import academy.maratonajava.javacore.Npolimofismo.dominio.Televissao;
import academy.maratonajava.javacore.Npolimofismo.dominio.Tomate;
import academy.maratonajava.javacore.Npolimofismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate", 3);
        Televissao tv = new Televissao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
