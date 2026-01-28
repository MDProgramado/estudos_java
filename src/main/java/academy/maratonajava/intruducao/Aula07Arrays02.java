package academy.maratonajava.intruducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //Arrays tem inicialização padrão para os tipos
        // int, float, double, byte, long, short é =  0
        // char '\u0000' ' '  ESPAÇO EM BRANCO
        //boolean false
        // String null ou qualquer tipo reference
        String[] nomes = new String[3];

        //O tamanho do ARRAY não pode aumentar dimanicamente
        nomes[0] = "Md";
        nomes[1] = "Maicon";
        nomes[2] = "Nociam";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
