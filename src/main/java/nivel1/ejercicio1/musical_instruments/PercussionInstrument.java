package nivel1.ejercicio1.musical_instruments;

public class PercussionInstrument extends Instrument {

    static {
        System.out.println("PercussionInstrument class loaded (static block)");
    }

    {
        System.out.println("PercussionInstrument instance initializer block executed");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}
