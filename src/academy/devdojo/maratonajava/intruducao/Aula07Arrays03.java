package academy.devdojo.maratonajava.intruducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[2];
        numeros[0] = 2;

        int[] numeros2 = {1,2,3,4,5,6};
        int[] numeros3 = new int[]{1,2,3,4,5,6};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for(int num : numeros3) {
            System.out.println(num);
        }
    }
}
