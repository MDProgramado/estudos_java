package academy.devdojo.maratonajava.intruducao;

public class Aula05EstrutuasCondicinais02 {
    public static void main(String[] args) {
        //idade < 15 = categoria infantil
        // idade >=15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        //   SEMPRE INICIALIZAR A VARIÁVEL E FAZER CONDICIONAIS PARA QUE QUANDO O CÓDIGO COMPILAR
        //  ELE SEMPRE RECEBA UM VALOR
        int idade = 17;
        String categoria;
        if(idade < 15) {
            categoria = "Categoria infatil";
        } else if (idade >= 15 && idade < 18) {
             categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria adulto";
        }

        categoria = idade < 15 ? "Categoria infatil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categoria adulto";
        System.out.println(categoria);

    }
}
