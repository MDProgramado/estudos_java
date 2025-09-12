package academy.devdojo.maratonajava.intruducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Arrays de meses = 1, 2, 3, 4, 5
        // Array de dias = 10, 11, 12

        int[][] matriz = {
                {1, 2, 3},   // Primeira linha
                {4, 5, 6},   // Segunda linha
                {7, 8, 9}    // Terceira linha
        };

        // Usando dois loops 'for' para percorrer a matriz
        for (int i = 0; i < matriz.length; i++) {  // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) {  // Percorre as colunas de cada linha
                System.out.print(matriz[i][j] + " "); // Imprime cada elemento
            }
            System.out.println(); // Quebra a linha para a próxima linha da matriz
        }
        System.out.println("--------------------");

        // Criando um array de arrays com número diferente de colunas em cada linha
        int[][] jaggedArray = {
                {1, 2},        // Primeira linha
                {3, 4, 5},     // Segunda linha
                {6, 7, 8, 9}   // Terceira linha
        };

        // Percorrendo o "jagged array" com for
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }



    }


}
