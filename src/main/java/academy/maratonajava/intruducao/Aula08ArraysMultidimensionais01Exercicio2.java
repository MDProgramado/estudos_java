package academy.maratonajava.intruducao;

public class Aula08ArraysMultidimensionais01Exercicio2 {
    public static void main(String[] args) {
        // Média de um Array com Múltiplas Condições

        int[] numeros = {10, 3, 5, 8, 12, 11, 4};

        // Variavel para somar apenas os numeros pares
        int somaPares = 0;

        // Variavel para contar quantos numeros pares existem
        int contadorPares = 0;

        // Loop unico para percorrer o array
        for (int numeroAtual : numeros) {
            // Verifica se o número e par (resto da divisao por 2 e 0)
            if (numeroAtual % 2 == 0) {
                somaPares += numeroAtual; // Adiciona o numero par a soma
                contadorPares++; // Incrementa o contador de pares
            }
        }

        // A media so e calculada apos o loop terminar
        if (contadorPares > 0) {
            // Converte para float para garantir o resultado com casas decimais
            float media = (float) somaPares / contadorPares;
            System.out.println("A media dos numeros pares e: " + media);
        } else {
            System.out.println("Nao ha numeros pares no array.");
        }
        System.out.println("-----------------------------------");

        //Localizador do Maior Valor

        int[] numeros2 = {15, 25, 10, 30, 20};

        // Inicializa o maior valor com o primeiro elemento do array
        int maiorValor = numeros2[0];

        // Inicializa o indice do maior valor
        int indiceMaiorValor = 0;

        // Loop para percorrer o array a partir do segundo elemento
        for (int i = 1; i < numeros2.length; i++) {
            // Compara o elemento atual com o maior valor encontrado até agora
            if (numeros2[i] > maiorValor) {
                maiorValor = numeros2[i]; // Atribui o novo maior valor
                indiceMaiorValor = i; // Atualiza o indice
            }
        }

        System.out.println("O maior valor e " + maiorValor + " e esta na posicao " + indiceMaiorValor);

    }
}
