package academy.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;


    {
        System.out.println("Dentro do bloco de inicializaçãoo");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        System.out.println(episodios);
        for (int episodio: this.episodios){
            System.out.println(
                    episodio + ""
            );
        }
    }
    public Anime(String nome){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
