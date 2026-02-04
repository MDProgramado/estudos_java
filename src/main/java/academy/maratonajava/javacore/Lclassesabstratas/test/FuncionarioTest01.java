package academy.maratonajava.javacore.Lclassesabstratas.test;

import academy.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffin", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("MD", 8000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
