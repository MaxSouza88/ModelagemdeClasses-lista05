package bola;

import java.util.Scanner;

public class Bola {

        int circunferencia;
        String cor;
        String marca;
        String material;
        double velocidade;

    public Bola(int circunferencia, String cor, String marca,String material, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }

        public String propriedadesDaBola(){
            String propriedades = "Circunferencia " +circunferencia+ " Cor " +cor+ " Marca " +marca+ " Material " +material+ " Velocidade " +velocidade;
            return propriedades;
        }

        public String mudaCor( ){
        Scanner input = new Scanner(System.in);
            System.out.println("Digite a nova cor");
            this.cor = input.next();
            return cor;
        }

}

