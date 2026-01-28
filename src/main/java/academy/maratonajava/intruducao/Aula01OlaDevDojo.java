package academy.maratonajava.intruducao;

public class Aula01OlaDevDojo {

    public static void main(String[] args) {
        int idade  = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebebida");
        }
        else {

            System.out.println("Não autorizado a comprar bebida");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }
        boolean c  = false;
        if (c == true ) {
            System.out.println("Dentro de algo que não deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
