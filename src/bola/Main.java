package bola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bola tipoBola1 = new Bola(2,"Verde","Penalty","Plástico",12.0);

        String b1 = tipoBola1.propriedadesDaBola();

        System.out.println(b1);


        System.out.println("Deseja alterar a cor da bola? S/N");
        String respoUsuario = input.next();
        if(respoUsuario.equalsIgnoreCase("s")) {
            tipoBola1.mudaCor();

            b1 = tipoBola1.propriedadesDaBola();

            System.out.println(b1);
        }else{
            System.out.println("Obrigado e volte sempre !!! ");
        }

    }
}
