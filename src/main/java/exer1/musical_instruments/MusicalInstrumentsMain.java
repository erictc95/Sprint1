package exer1.musical_instruments;

public class MusicalInstrumentsMain {
    public static void main(String[] args) {
        Instrument Instrument1 = new WindInstrument("Flauta", 50);
        Instrument Instrument2 = new StringInstrument("Guitarra", 200);
        Instrument Instrument3 = new PercussionInstrument("Tambor", 500);
        System.out.println("Playing Time");
        Instrument1.play();
        Instrument2.play();
        Instrument3.play();


    }
}
