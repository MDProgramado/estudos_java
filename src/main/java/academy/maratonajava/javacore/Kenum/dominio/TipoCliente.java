package academy.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int VALOR) {
        this.VALOR = VALOR;
    }
}
