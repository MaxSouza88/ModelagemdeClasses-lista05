package Ex01;

public class main {

    public static void main(String[] args) {

        Bola tipoBola1 = new Bola(1,"verde","Penalty",15.0);
        Bola tipoBola2 = new Bola(2,"preto","Asics",12.0);

        String resultado = tipoBola1.propriedadesDaBola();

        System.out.println(" Características da Bola: " +resultado);

        resultado = tipoBola2.propriedadesDaBola();

        System.out.println(" O modelo da bola é: " +resultado);


    }
}
