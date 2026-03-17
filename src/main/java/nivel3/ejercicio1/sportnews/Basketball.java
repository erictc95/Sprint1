package nivel3.ejercicio1.sportnews;

public class Basketball extends New{
    private String competicio;
    private String club;

    public Basketball(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public int calculatePrice() {
        int totalPrice = 250;
        if (competicio.equals("euroleague")){
            totalPrice += 75;
        }
        if (club.equals("barça") || club.equals("madrid")){
            totalPrice += 75;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int totalScore = 4;
        if (competicio.equals("euroleague")){
            totalScore += 3;
        }
        if (competicio.equals("acb")) {
            totalScore += 2;
        }
        if (club.equals("barça") || club.equals("madrid")) {
            totalScore += 1;
        }
        return totalScore;
    }
}
