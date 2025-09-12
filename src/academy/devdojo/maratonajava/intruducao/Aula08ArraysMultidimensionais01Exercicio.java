package academy.devdojo.maratonajava.intruducao;

public class Aula08ArraysMultidimensionais01Exercicio {
    public static void main(String[] args) {
        int[][] notas = {
                {85, 90, 88},  // Notas do Estudante 1: Matemática, Física, Química
                {78, 83, 80},  // Notas do Estudante 2
                {92, 95, 91}   // Notas do Estudante 3
        };

        for (int[] arrNotas : notas) {
            int soma = 0;
            for (int num : arrNotas) {

                soma += num;
                System.out.println(num);
            }
            double media = (double) (soma + arrNotas.length) / 3;
            System.out.println("A média de nota do aluno é: " + media);
            System.out.println();
        }
        System.out.println("----------------------");
        // Inverter um Array

        int[] numeros1 = {1, 2, 3, 4, 5};

        int inicio = 0;
        int fim = numeros1.length - 1;
        while (inicio < fim) {
            int temp = numeros1[inicio];
            numeros1[inicio] = numeros1[fim];
            numeros1[fim] = temp;
            inicio++;
            fim--;
        }

        for (int num : numeros1) {
            System.out.println(num);
        }
        System.out.println("---------------------------------");

        int[] numeros3 = {1, 2, 2, 3, 4, 2, 5};
        int numeroProcurado = 2;
        int contador = 0;

// Loop para percorrer o array
        for (int i = 0; i < numeros3.length; i++) {
            // Acessa o valor do elemento na posição i
            if (numeros3[i] == numeroProcurado) {
                // Se o valor for igual ao número procurado, incrementa o contador
                contador++;
            }
        }

        System.out.println("O número " + numeroProcurado + " aparece " + contador + " vezes no array.");
    }
}
