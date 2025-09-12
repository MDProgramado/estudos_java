package academy.devdojo.maratonajava.javacore.Aintroducao.classes.test;

import academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        estudante.nome = "Maicon";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante1.nome = "MD";
        estudante1.idade = 22;
        estudante1.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
