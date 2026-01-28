package academy.maratonajava.intruducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //imprima o dia da semana considerando o domingo
        byte dia = scanner.nextByte();

        // Só aceita esses tipos de dados = char, int, byt, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Imprima domingo");
            case 2:
                System.out.println("Imprima segunda");
                break;
            case 3:
                System.out.println("Imprima terça");
                break;
            case 4:
                System.out.println("Imprima quarta");
            break;
                case 5:
                System.out.println("Imprima quinta");
            break;
                case 6:
                System.out.println("Imprima sexta");
            break;
                case 7:
                System.out.println("Imprima sábado");
            break;
            default:
                System.out.println("Opção invalida");
            break;
        }


    }
}
