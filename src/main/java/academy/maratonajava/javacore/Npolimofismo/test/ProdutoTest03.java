package academy.maratonajava.javacore.Npolimofismo.test;

import academy.maratonajava.javacore.Npolimofismo.dominio.Computador;
import academy.maratonajava.javacore.Npolimofismo.dominio.Produto;
import academy.maratonajava.javacore.Npolimofismo.dominio.Tomate;
import academy.maratonajava.javacore.Npolimofismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Dentel 7", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
