public class Phone {
    public static void main(String[] args) {
        RehanPhone r=new RehanPhone();
        r.cooking();
    }
}
abstract class RafikPhone{
    public void call(){
        System.out.println("I am created callig class");

    }
    public  abstract  void Dance();
    public  abstract  void move();
    public  abstract  void cooking();

}
 abstract class Aakashphone extends  RafikPhone{
    public  void Dance(){
        System.out.println("this phone is dancing on the floor");
    }

}
class RehanPhone extends  Aakashphone{
    @Override
    public void cooking() {
        System.out.println("this phone is cooking");
    }

    @Override
    public void move() {
        System.out.println("this phome is moving");
    }
}
