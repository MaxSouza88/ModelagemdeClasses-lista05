package Ex03;

public class main {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("0022", "João Pedro", 273.88);
        ContaCorrente conta2 = new ContaCorrente("0284", "Gilberto", 1048.33);

        String resultadoConta1 = conta1.mostraRetorno();
        System.out.println(resultadoConta1);

        resultadoConta1 = conta2.mostraRetorno();
        System.out.println(resultadoConta1);
    }

}
