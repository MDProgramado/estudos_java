package academy.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private float salario;


    static {
        System.out.println("Dentro do bloco estático de funcinario");
    }
    {
        System.out.println("Dentrp do bloco de inicialização de funcionario 1 ");
    }  {
        System.out.println("Dentrp do bloco de inicialização de pessoa 2 ");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);
    }
    public void relatorioagamento(){
        System.out.println("Eu " + this.nome);
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
