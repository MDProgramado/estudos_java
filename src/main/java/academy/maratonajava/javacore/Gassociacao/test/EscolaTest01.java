package academy.maratonajava.javacore.Gassociacao.test;

import academy.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        //Assoaição de muitos para muitos
        Professor professor1 = new Professor("José");
        Professor professor2 = new Professor("Kakashi");
        Professor professor3 = new Professor("Jiraya");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Bento", professores);
        escola.imprimir();


    }
}
