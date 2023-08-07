public class Ave extends AnimalBase{
    @Override
    public void emitSound() {
        System.out.println("As aves cantam.");
        super.emitSound();
    }

    @Override
    public void move() {
        System.out.println("As aves voam.");
        super.move();
    }
}
