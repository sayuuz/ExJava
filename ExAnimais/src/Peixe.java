public class Peixe extends AnimalBase{
    @Override
    public void emitSound() {
        System.out.println("Os peixes não emitem som.");
        super.emitSound();
    }

    @Override
    public void move() {
        System.out.println("Os peixes nadam.");
        super.move();
    }
}
