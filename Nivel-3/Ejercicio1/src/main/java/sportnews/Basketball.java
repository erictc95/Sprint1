package sportnews;

public class Basketball extends News{
    private String competicio;
    private String club;

    public Basketball(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public int calculatePriceNew() {
        int basePrice = 250;
        int totalPrice = 0;
        if (competicio.equals("Euroleague")){
            totalPrice = basePrice + 75;
        } else if (club.equals("Barça") || club.equals("Madrid")) {
            totalPrice = basePrice + 75;
        }
        return totalPrice;
    }

    @Override
    public int calculateScoreNew() {
        int baseScore = 4;
        int totalScore = 0;
        if (competicio.equals("Euroleague")){
            totalScore = baseScore + 3;
        } else if (competicio.equals("ACB")) {
            totalScore = baseScore + 2;
        } else if (club.equals("Barça") || club.equals("Madrid")) {
            totalScore = baseScore + 1;
        }
        return totalScore;
    }
}
