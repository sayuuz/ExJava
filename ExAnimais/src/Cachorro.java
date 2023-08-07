public class Cachorro extends AnimalBase{
    @Override
    public void emitSound() {
        System.out.println("Os cachorros latem.");
        super.emitSound();
    }

    @Override
    public void move() {
        System.out.println("Os cachorros andam.");
        super.move();
    }
}
