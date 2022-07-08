package quadrado;

public class Quadrado {

    double ladoQuadrado = 2;

    //double result = ladoQuadrado * 2 ;


    public Quadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public String baseQuadrado(){
        String quadrados = " Medida do quadrado é: " +ladoQuadrado;
        return quadrados;
    }

}
