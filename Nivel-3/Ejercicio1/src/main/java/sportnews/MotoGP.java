package sportnews;

public class MotoGP extends News{
    private String equip;

    public MotoGP(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public int calculatePriceNew() {
        int basePrice = 100;
        int totalPrice = 0;
        if (equip.equals("Honda") || equip.equals("Yamaha")) {
            totalPrice = basePrice + 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScoreNew() {
        int baseScore = 3;
        int totalScore = 0;
        if (equip.equals("Honda") || equip.equals("Yamaha")) {
            totalScore = baseScore + 3;
        }
        return totalScore;
    }
}
