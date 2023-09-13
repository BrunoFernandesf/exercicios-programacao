package ex02;

public class Calculo {
    public int grades(int geo, int alg, int phy){
        int avg = (geo + alg + phy) / 3;
        System.out.println("A média das suas notas é: "+ avg);
        return avg;
    }
}
