package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){

        System.out.println(10 + 10);
    }
    public void subritraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNumeros(int numb1, int numb2){
        System.out.println(numb1 * numb2);
    }
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 ==0) {
            return 0;
        }
        else {
            return  num1 / num2;
        }
    }

}
