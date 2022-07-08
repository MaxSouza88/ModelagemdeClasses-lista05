package quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Quadrado quadrado = new Quadrado(2);

        String result = quadrado.baseQuadrado();

        System.out.println(result);

        System.out.println("Informe nova medida da base do Quadrado: ");
        quadrado.ladoQuadrado = input.nextDouble();

        double quad1 = quadrado.ladoQuadrado * 2 ;

        System.out.println("Calculando ........");

        System.out.println("Nova área do Quadrado é: " +quad1);



    }
}
