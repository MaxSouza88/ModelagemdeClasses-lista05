package retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo(2,3);
        double resultado = retangulo.baseRet * retangulo.alturaRet;
        System.out.println(resultado);
        System.out.println("Primeiro valor do perímetro: " +resultado);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        System.out.println("Digite o valor da Base " );
        retangulo.baseRet = input.nextDouble();

        System.out.println("Digite o valor da Altura " );
        retangulo.alturaRet = input.nextDouble();

        resultado = retangulo.baseRet * retangulo.alturaRet;

        System.out.println("O perímetro do retângulo é: " +resultado);

    }
}
