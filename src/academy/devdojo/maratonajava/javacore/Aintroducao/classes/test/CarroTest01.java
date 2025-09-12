package academy.devdojo.maratonajava.javacore.Aintroducao.classes.test;

import academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Audi R8";
        carro1.modelo = "SPORT";
        carro1.ano = 2024;

        carro2.nome = "BMW";
        carro2.modelo = "USV";
        carro2.ano = 2023;


        carro1 = carro2; //O objeto carro1 esta fazendo referência ao espaço de memória do objeto carro2
        //Só podemos fazer esse tipo de associação para as variáveis do mesmo tipo
        //Ex errado professor1 = carro2;
        System.out.println("Carro1\n");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);



        System.out.println("Carro2\n");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
