package bird;

public class Hen extends Bird implements pyabale {

    public Hen(double wt, String color) {
            super(wt, color);
        }

        @Override
        public void fly() {
            System.out.println("Hen can fly");

        }
}

