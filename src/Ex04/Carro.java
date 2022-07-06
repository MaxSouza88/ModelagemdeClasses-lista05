package Ex04;

public class Carro {

    String qtdePortas;
    String modelo;
    String marca;
    String potencia;

    public Carro(String qtdePortas, String modelo, String marca, String potencia) {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String retornoCarro(){
        String car1 = "Quantidade de portas " +qtdePortas+ " Modelo " +modelo+ " Marca " +marca+ " Potencia " +potencia;
        return car1;
    }


}
