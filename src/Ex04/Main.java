package Ex04;

public class Main {
    public static void main(String[] args) {

        Carro suv1 = new Carro("4","RENEGADE", "JEEP", "2.3");
        Carro suv2 = new Carro("4","COMPASS", "JEEP", "3.1");

        String c1 = suv1.retornoCarro();
        System.out.println(c1);

        c1 = suv2.retornoCarro();
        System.out.println(c1);

    }
}
