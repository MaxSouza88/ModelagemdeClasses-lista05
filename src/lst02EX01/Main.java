package lst02EX01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bola1 bola1 = new Bola1("Jabulani","Rosa", "5","Plastico");
        String resultado = bola1.resultBola();
        System.out.println(resultado);

        System.out.println("Digite nova cor da bola");
        bola1.cor = input.next();

        resultado = bola1.resultBola();

        System.out.println(resultado);


    }
}
