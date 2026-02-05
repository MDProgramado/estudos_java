package academy.maratonajava.javacore.Npolimofismo.dominio;

public class Televissao extends Produto{
    public final static double IMPOSTO_POR_CENTO = 0.21;
    public Televissao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televissão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
