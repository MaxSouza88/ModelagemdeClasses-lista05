package quadrado;

import java.util.Scanner;

public class Quadrado {

    Scanner input = new Scanner(System.in);

    double ladoQuadrado = 2;

    public Quadrado() {
        this.ladoQuadrado = ladoQuadrado;
    }

    public void baseQuadrado(){
        System.out.println("Seu valor padrao do quadrado é: " +ladoQuadrado);
    }

    public void alteraLado(){
        System.out.println("Informe nova medida da base do Quadrado: ");
        ladoQuadrado = input.nextDouble();

        double quad1 = ladoQuadrado * ladoQuadrado;

        System.out.println("Calculando ........");

        System.out.println("Nova área do Quadrado é: " +quad1);

    }

}
