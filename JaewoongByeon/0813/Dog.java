public class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        int j = super.getStep() + 5;
        System.out.printf("Dogs can walk and run step " + j);
    }
}