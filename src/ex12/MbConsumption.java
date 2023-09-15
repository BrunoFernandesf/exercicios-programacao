package ex12;

public class MbConsumption {
    public static void main(String[] args) {
        double wikiCost = 0.1;
        double memeCost = 0.05;
        int timeWiki = 500;
        int timeMeme = 1050;
        double total = (wikiCost * timeWiki) + (memeCost * timeMeme);

        if(total >= 100){
            System.out.println("Consumo demais");
            if(timeMeme > timeWiki){
                System.out.println("WOW Tantos memes, LOL ");
            }
        }
    }
}
