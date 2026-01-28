package academy.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private float salario;


    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
