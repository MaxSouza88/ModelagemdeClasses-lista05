package Ex02;

public class main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carlos",28,78.8,1.73);
        Pessoa pessoa2 = new Pessoa("Pedro",32,89.8,1.82);

        String novaPessoa = pessoa1.propriedadesPessoa();
        System.out.println(novaPessoa);

        novaPessoa = pessoa2.propriedadesPessoa();
        System.out.println(novaPessoa);


    }
}
