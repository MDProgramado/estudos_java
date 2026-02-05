package academy.maratonajava.javacore.Npolimofismo.repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
