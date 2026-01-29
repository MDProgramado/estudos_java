package academy.maratonajava.javacore.Jmodificadorfinal.test;

import academy.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Comprador comprador2 = new Comprador();
        carro.COMPRADOR = comprador2;
        System.out.println();
    }
}
