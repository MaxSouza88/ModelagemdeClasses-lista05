package Ex02;

public class Pessoa {

    String nome;
    int idade;
    double peso = 0;
    double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String propriedadesPessoa(){
        String serHumano = "Nome "+nome+ " Idade "+idade+ " Peso "+peso+ " Altura "+altura;
        return serHumano;
    }

}
