package academy.maratonajava.javacore.Minterfaces.dominio;

public class FilerLoarder implements  DataLoarder{
    @Override
    public void load() {
        System.out.println("Carregando dados no arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões nos arquivos");
    }
}
