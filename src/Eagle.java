public class Eagle extends  Bird implements  pyabale{

    public Eagle(double wt, String color) {
        super(wt, color);
    }

    @Override
    public void fly() {
        System.out.println("hey Eagle u can fly also");

    }
}
