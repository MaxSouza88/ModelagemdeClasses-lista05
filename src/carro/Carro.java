package carro;

import java.util.Scanner;

public class Carro {

    Scanner input = new Scanner(System.in);

    String qtdePortas;
    String modelo;
    String marca;
    double potencia;

    public Carro() {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public String retornoCarro(){
        String car1 = "Quantidade de portas " +qtdePortas+ " Modelo " +modelo+ " Marca " +marca+ " Potencia " +potencia;
        return car1;
    }

    public void cadCarro(){
        System.out.println("Digite o Modelo do carro a ser cadastrado: ");
        modelo = input.next();

        System.out.println("Digite a marca do carro a ser cadastrado: ");
        marca = input.next();

        System.out.println("Digite a quantidade de portas: ");
        qtdePortas = input.next();

        System.out.println("Digite a potencia do carro: ");
        potencia = input.nextDouble();

        System.out.println("Modelo do carro: " +modelo);
        System.out.println("Marca do carro: " +marca);
        System.out.println("Quantidade de portas do carro: " +qtdePortas);
        System.out.println("Potencia do carro: " +potencia);
    }

    public void ligaCarro(){
        System.out.println("Deseja ligar o carro? ");
        String resposta = input.next();

        if( resposta.equalsIgnoreCase("s")){
            System.out.println("Carro Ligado, pode acelerar !!! ");
        }else {
            System.out.println("Carro desligado, necessário ligá-lo !!! ");
        }
    }


}
