package academy.maratonajava.javacore.Fmodificadorestatico.test;

import academy.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW",  380);
        Carro carro2 = new Carro("Audi", 270);
        Carro carro3 = new Carro("BYD",  480);

        carro1.imprimi();
        carro2.imprimi();
        carro3.imprimi();

        Carro.setVelocidadeLimite(180);

    }
}
