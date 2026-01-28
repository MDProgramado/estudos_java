package academy.maratonajava.intruducao;
import  java.util.Scanner;
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, considerando 1 como domingo

        Scanner scanner = new Scanner(System.in);

        byte diaUtil = scanner.nextByte();

        switch (diaUtil) {

            case 1:
            case 7:
                System.out.println("FDS");
             break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
            break;

            default:
                System.out.println("Dia invalido");
        }
    }
}
