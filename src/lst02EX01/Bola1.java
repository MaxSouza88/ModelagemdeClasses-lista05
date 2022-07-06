package lst02EX01;

public class Bola1 {

    String nomeBola = "Jabulani";
    String cor = "Branco";
    String circunferencia;
    String material;

    public Bola1(String nomeBola,String cor, String circunferencia, String material) {
        this.nomeBola = nomeBola;
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public String resultBola(){
        String rstBola = " Nome da Bola " +nomeBola+ " Cor " +cor+ " Circunferência " +circunferencia+ " Material " +material;
        return rstBola;
    }
}
