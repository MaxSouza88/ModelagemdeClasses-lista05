package retangulo;

import java.util.Scanner;

public class Retangulo {
    Scanner input = new Scanner(System.in);
    double baseRet;
    double alturaRet;

    double resultArea;
    double resultPer;

    public Retangulo() {
        this.baseRet = baseRet;
        this.alturaRet = alturaRet;
    }
    public void resultado(){
        System.out.println("Informe valor da Base");
        baseRet = input.nextDouble();

        System.out.println("Informe valor da Altura");
        alturaRet = input.nextDouble();

        resultArea = baseRet * alturaRet;
        resultPer = (baseRet * alturaRet) * 2;

        System.out.println("Valor da Area: " +resultArea);
        System.out.println("Valor do Perímetro: " +resultPer);

    }
}
