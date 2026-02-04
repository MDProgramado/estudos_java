package academy.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends  Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    private static final double BONUS = 0.05;

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * BONUS;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
