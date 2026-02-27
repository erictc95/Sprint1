package nivel3.ejercicio1.sportnews;

public class Football extends New {
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
    public int calculatePrice() {
        int totalPrice = 300;
        if (competicio.equals("champions league")) {
            totalPrice += 100;
        }
        if (club.equals("barça") || club.equals("madrid")) {
            totalPrice += 100;
        }
        if (jugador.equals("ferran torres") || jugador.equals("benzema")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int totalScore = 5;
        if (competicio.equals("champions league")) {
            totalScore += 3;
        }
        if (competicio.equals("league")) {
            totalScore += 2;
        }
        if (club.equals("barça") || club.equals("madrid")) {
            totalScore += 1;
        }
        if (jugador.equals("ferran torres") || jugador.equals("benzema")) {
            totalScore += 1;
        }
        return totalScore;
    }


}
