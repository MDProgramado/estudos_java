package academy.devdojo.maratonajava.intruducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        //imprima os primeiros 25 numeros dado um valor. Exemp 50

        int valueMax = 50;
        for (int i = 0; i <= valueMax; i++) {
            if (i > 25) {
                break;

                //Podemos usar break dentro de um switch, if e um for
            }
            System.out.println(i);
        }
    }
}
