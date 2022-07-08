package contaCorrente;

import java.util.Scanner;

public class ContaCorrente {

    Scanner input = new Scanner(System.in);

    String numeroDaConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente() {
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public String mostraRetorno(){
        String result = "Numero da Conta " +numeroDaConta+ " Nome da CC " +nomeCorrentista+ " Saldo " +saldo;
        return result;

    }


        public void inicioConta(){

            System.out.println("Digite sua conta para cadastro !!! " );
            numeroDaConta = input.next();

            System.out.println("Digite seu nome para cadastro !!! " );
            nomeCorrentista = input.next();

            System.out.println("Seus dados são: ");
            System.out.println("Nome: " +nomeCorrentista);
            System.out.println("Conta Corrente: " +numeroDaConta);

            System.out.println("Na abertura da conta, seu saldo é " +saldo);
        }

        public void depositoConta(){
            System.out.println("Digite o valor a ser depositado: ");
            double deposito = input.nextDouble();
            saldo +=deposito;
        }

        public void retiraConta(){
            System.out.println("Digite o valor a ser sacado: ");
            double saque = input.nextDouble();
            saldo -=saque;
        }

    public void alteraConta(){

        System.out.println("Deseja Depositar ou sacar ? ");
        System.out.println("1 - Depósito ");
        System.out.println("2 - Saque ");
        System.out.println("Outro numero para não alterar nada ");
        int respoUsuario = input.nextInt();
        if (respoUsuario == 1) {
            depositoConta();

            System.out.println("Saldo atualizado é: " +saldo);
            alteraConta();

        } else if(respoUsuario == 2){
            retiraConta();

            System.out.println("Saldo atualizado é: " +saldo);
            alteraConta();
        }else {
            System.out.println("Obrigado por utilizar nosso BANCO");
        }

    }

}
