package sportnews;

public class Tennis extends News{
    private String competicio;
    private String tenistes;

    public Tennis(String titular, String team, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public int calculatePriceNew() {
        int basePrice = 150;
        int totalPrice = 0;
        if (tenistes.equals("Federer") || tenistes.equals("Nadal") || tenistes.equals("Djokovic")) {
            totalPrice = basePrice + 100;
        }
        return totalPrice;
    }

    @Override
    public int calculateScoreNew() {
        int baseScore = 4;
        int totalScore = 0;
        if (tenistes.equals("Federer") || tenistes.equals("Nadal") || tenistes.equals("Djokovic")) {
            totalScore = baseScore + 3;
        }
        return totalScore;
    }
}
