package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Md");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[] { 120000, 9000, 5000});

        funcionario.imprimir();
        System.out.println("Média " + funcionario.getMedia());

    }
}
