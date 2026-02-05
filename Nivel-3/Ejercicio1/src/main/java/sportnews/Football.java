package sportnews;

public class Football extends News{
    private String competicio;
    private String club;
    private String jugador;

    public Football(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public int calculatePriceNew() {
        int basePrice = 300;
        int totalPrice = 0;
        if (competicio.equals("Champions League")){
            totalPrice = basePrice + 100;
        } else if (club.equals("Barça") || club.equals("Madrid")) {
            totalPrice = basePrice + 100;
        } else if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            totalPrice = basePrice + 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScoreNew() {
        int baseScore = 5;
        int totalScore = 0;
        if (competicio.equals("Champions League")){
            totalScore = baseScore + 3;
        } else if (competicio.equals("League")) {
            totalScore = baseScore + 2;
        } else if (club.equals("Barça") || club.equals("Madrid")) {
            totalScore = baseScore + 1;
        } else if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            totalScore = baseScore + 1;
        }
        return totalScore;
    }


}
