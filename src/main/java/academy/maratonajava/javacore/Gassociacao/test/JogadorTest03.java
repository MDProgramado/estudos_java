package academy.maratonajava.javacore.Gassociacao.test;

import academy.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador[] jogadores = {jogador};
        Time time = new Time("Brasil");

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprimir();

        System.out.println("--- Jogador ---");

        time.imprimir();
    }
}
