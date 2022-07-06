package Ex01;

public class Bola {

        int circunferencia;
        String cor;
        String marca;
        double velocidade;

    public Bola(int circunferencia, String cor, String marca, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }

        public String propriedadesDaBola(){
            String propriedades = "Circunferencia " +circunferencia+ " Cor " +cor+ " Marca " +marca+ " Velocidade " +velocidade;
            return propriedades;
        }
}

