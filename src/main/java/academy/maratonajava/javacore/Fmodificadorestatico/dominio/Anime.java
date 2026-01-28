package academy.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    /* Usamos o bloco de inicialização
     precisam rodar uma mesma lógica inicial
      (ex: conectar no banco de dados),
      você usa o bloco para não repetir código
      (Copy/Paste) em 5 lugares.*/

    static {
        System.out.println("Dentro do bloco de inicializaçãoo");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        System.out.println(episodios);
        for (int episodio: Anime.episodios){
            System.out.println(
                    episodio + ""
            );
        }
    }

    /*Quando roda: Ele é executado apenas uma vez,
     no momento em que a classe é carregada na memória pela JVM
     (Java Virtual Machine),
     antes mesmo de qualquer objeto ser criado. */

    /*Por que usar: Para inicializar variáveis estáticas complexas.

Exemplo: Você tem uma lista estática de "Estados do Brasil".
Você não quer preencher essa lista toda vez que criar um cliente.
Você quer preencher uma única vez quando o sistema ligar. */


    public Anime(){
        for (int episodio: episodios){
            System.out.print(episodio + "");
        }

        System.out.println();
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
