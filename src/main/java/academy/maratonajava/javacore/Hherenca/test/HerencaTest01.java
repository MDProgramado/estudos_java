package academy.maratonajava.javacore.Hherenca.test;

import academy.maratonajava.javacore.Hherenca.dominio.Enderco;
import academy.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Enderco enderco = new Enderco();
        enderco.setRua("Rua 3");
        enderco.setCEP("353-185");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Douglas");
        pessoa.setCpf("000000000");
        pessoa.setEnderco(enderco);

        pessoa.imprimir();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago");
        funcionario.setCpf("4444444");
        funcionario.setSalario(2000);
        funcionario.imprimir();
    }
}
