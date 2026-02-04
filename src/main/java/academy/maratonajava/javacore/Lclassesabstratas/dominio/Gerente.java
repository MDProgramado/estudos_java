package academy.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    private static final double BONUS = 0.2;

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario *  BONUS;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
