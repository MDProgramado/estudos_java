package academy.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements  DataLoarder, DataRemover {

    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }
}
