package academy.maratonajava.javacore.Dconstrutores.test;

import academy.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyu", "Tv", 12, "Romance", "MAPA");
        Anime anime2 = new Anime();


        anime.imprimi();

    }
}
