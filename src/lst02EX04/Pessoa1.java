package lst02EX04;

public class Pessoa1 {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa1(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String p1(){
        String ser1 = "Nome " +nome+ " Idade " +idade+ " Peso " +peso+ " Altura " +altura;
        return ser1;
    }

   public void idade (){
        this.idade += 1;
    }

    public void engordar(double peso){
        this.peso += peso;
    }

    public void emagrecer(double peso){
        this.peso -= peso;
    }

    public void crescer (double altura){
        this.altura += altura;
    }






}
