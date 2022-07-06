package Ex03;

public class ContaCorrente {

    String numeroDaConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(String numeroDaConta, String nomeCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public String mostraRetorno(){
        String result = "Numero da Conta " +numeroDaConta+ " Nome da CC " +nomeCorrentista+ " Saldo " +saldo;
        return result;

    }

}
