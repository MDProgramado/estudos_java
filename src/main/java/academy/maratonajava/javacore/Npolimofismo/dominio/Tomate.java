package academy.maratonajava.javacore.Npolimofismo.dominio;

public class Tomate extends Produto{
    public final static double IMPOSTO_POR_CENTO = 0.06;

    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor = this.valor + this.valor * IMPOSTO_POR_CENTO;
    }
}
