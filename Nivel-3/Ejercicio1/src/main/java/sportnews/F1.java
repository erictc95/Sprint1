package sportnews;

public class F1 extends News{
    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public int calculatePriceNew() {
        int basePrice = 100;
        int totalPrice = 0;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            totalPrice = basePrice + 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScoreNew() {
        int baseScore = 4;
        int totalScore = 0;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            totalScore = baseScore + 2;
        }
        return totalScore;
    }
}
