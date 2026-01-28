package academy.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    private  String nome;
    private String cpf;
    private Enderco enderco;


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
