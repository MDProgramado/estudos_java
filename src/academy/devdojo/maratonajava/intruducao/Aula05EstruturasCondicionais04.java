package academy.devdojo.maratonajava.intruducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioAnual = scanner.nextDouble();
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.55 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if ( salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        }
        else if (salarioAnual >= 34123 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        }
        else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(valorImposto);
    }
}
