package pessoa;

import java.util.Scanner;

public class Pessoa {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }

    public String p1() {
        String ser1 = "Nome " + nome + " Idade " + idade + " Peso " + peso + " Altura " + altura;
        return ser1;
    }

    public void informacaoPessoal() {
        System.out.println("Digite seu nome");
        nome = input.next();

        System.out.println("Digite sua idade");
        idade = input.nextInt();

        System.out.println("Digite seu Peso");
        peso = input.nextDouble();

        System.out.println("Digite sua Altura ");
        altura = input.nextDouble();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Sua altura é: " + altura);
    }

    public void alteraDados() {
        System.out.println("Deseja alterar algum dado ? ");
        System.out.println("1 - Nome ");
        System.out.println("2 - Idade ");
        System.out.println("3 - Peso ");
        System.out.println("4 - Altura");
        System.out.println("Outro numero para não alterar nada ");
        int respoUsuario = input.nextInt();
        if (respoUsuario == 1) {
            System.out.println("Digite o novo Nome");
            nome = input.next();

            System.out.println("Novo nome digitado é:" + nome);
            alteraDados();

        } else if (respoUsuario == 2) {
            System.out.println("Digite a nova Idade");
            idade = input.nextInt();

            System.out.println("Nova idade digitada é:" + idade);
            alteraDados();

        } else if (respoUsuario == 3) {
            System.out.println("Digite o novo Peso");
            peso = input.nextDouble();

            System.out.println("Novo peso digitado é:" + peso);
            alteraDados();

        } else if (respoUsuario == 4) {
            System.out.println("Digite a nova Altura");
            altura = input.nextDouble();

            System.out.println("Nova altura digitada é:" + altura);
            alteraDados();

        } else {

            System.out.println("Obrigado e Volte Sempre");

        }
    }

    public void crescimentoCrianca() {
        if (this.idade < 21) {
            System.out.println(" Informe a sua idade: ");
            idade = input.nextInt();
            double calculoCrescimento = 0;
            double crescer = 0.05;
            calculoCrescimento = idade * crescer;

            System.out.printf("você cresceu %.2f ", calculoCrescimento);


        } else {
            System.out.println("Voce não cresce mais!!");

        }

    }
}