package nivel3.ejercicio1.sportnews;

public class MotoGP extends New{
    private String equip;

    public MotoGP(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public int calculatePrice() {
        int totalPrice = 100;
        if (equip.equals("honda") || equip.equals("yamaha")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int totalScore = 3;
        if (equip.equals("honda") || equip.equals("yamaha")) {
            totalScore += 3;
        }
        return totalScore;
    }
}
