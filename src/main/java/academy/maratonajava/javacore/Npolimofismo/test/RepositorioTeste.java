package academy.maratonajava.javacore.Npolimofismo.test;

import academy.maratonajava.javacore.Npolimofismo.repositorio.Repositorio;
import academy.maratonajava.javacore.Npolimofismo.repositorio.RepositorioArquivo;

import java.util.LinkedList;
import java.util.List;


public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Naruto");
        list.add("Luffin");
    }
}
