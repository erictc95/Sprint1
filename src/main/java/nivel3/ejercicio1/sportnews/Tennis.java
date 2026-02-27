package nivel3.ejercicio1.sportnews;

public class Tennis extends New{
    private String competicio;
    private String tenistes;

    public Tennis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public int calculatePrice() {
        int totalPrice = 150;
        if (tenistes.equals("federer") || tenistes.equals("nadal") || tenistes.equals("djokovic")) {
            totalPrice += 100;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int totalScore = 4;
        if (tenistes.equals("federer") || tenistes.equals("nadal") || tenistes.equals("djokovic")) {
            totalScore += 3;
        }
        return totalScore;
    }
}
