package academy.maratonajava.javacore.Minterfaces.test;


import academy.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.maratonajava.javacore.Minterfaces.dominio.FilerLoarder;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FilerLoarder filerLoarder = new FilerLoarder();
        databaseLoader.load();
        filerLoarder.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        filerLoarder.checkPermission();
    }
}
