package lst02EX04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pessoa1 pessoa1 = new Pessoa1("Pedro", 31,89,177);
        Pessoa1 pessoa2 = new Pessoa1("Edvaldo", 42,72,175);

        String r1 = pessoa1.p1();
        String r2 = pessoa2.p1();

        System.out.println(r1);
        System.out.println(r2);

        pessoa1.crescer(4);
        r1 = pessoa1.p1();

        System.out.println(r1);

    }
}
