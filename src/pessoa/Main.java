package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        pessoa.informacaoPessoal();

        pessoa.alteraDados();

        pessoa.crescimentoCrianca();
    }
}