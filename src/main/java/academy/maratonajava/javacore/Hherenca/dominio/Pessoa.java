package academy.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Enderco enderco;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Dentrp do bloco de inicialização de pessoa 1 ");
    }  {
        System.out.println("Dentrp do bloco de inicialização de pessoa 2 ");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do construtor");
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.enderco.getRua() + " " +this.enderco.getCEP());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Enderco getEnderco() {
        return enderco;
    }

    public void setEnderco(Enderco enderco) {
        this.enderco = enderco;
    }
}
