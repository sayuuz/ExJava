public class AnimalSimulator {
    public static void main(String[] args) {
        AnimalBase px = new Peixe();
        AnimalBase ch = new Cachorro();
        AnimalBase av = new Ave();

        px.emitSound();
        px.move();

        ch.emitSound();
        ch.move();

        av.emitSound();
        av.move();
    }
}
