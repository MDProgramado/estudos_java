package academy.devdojo.maratonajava.javacore.Aintroducao.classes.test;

import academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Jv";
        professor.Idade = 20;
        professor.sexo = 'M';

        System.out.println("Nome do professor: " +professor.nome + " " + "idade do professor: " + professor.Idade + " " + "sexo do professor: " + professor.sexo);
    }
}
