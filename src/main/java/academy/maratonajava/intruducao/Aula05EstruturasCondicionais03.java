package academy.maratonajava.intruducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //OPERADORES TERNÁRIOS
        // Sintaxe do operador ternário (condição) ? verdadeiro : falso;
        //doar se salario > 5000
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 para o dev dojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        //Podemos usar o ternário para fazer o if, else if e else, MAS NÃO É RECOMENDADO
        // categoria = idade < 15 ? "Categoria infatil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categoria adulto";
        System.out.println(resultado);
    }
}
