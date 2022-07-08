package retangulo;

public class Retangulo {
    double baseRet;
    double alturaRet;

    public Retangulo(double baseRet, double alturaRet) {
        this.baseRet = baseRet;
        this.alturaRet = alturaRet;
    }

    public String Retangulo1(){
        String result = "Base: " +baseRet+ " Altura: " +alturaRet;
        return result;
    }
}
