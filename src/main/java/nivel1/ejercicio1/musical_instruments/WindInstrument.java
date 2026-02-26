package nivel1.ejercicio1.musical_instruments;

public class WindInstrument extends Instrument {

    static {
        System.out.println("WindInstrument class loaded (static block)");
    }

    {
        System.out.println("WindInstrument instance initializer block executed");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }
}
