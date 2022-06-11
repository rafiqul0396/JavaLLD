interface  pyabale{
    public  void fly();
}

public class DependencyInversion  {
    Bird b;
    public  DependencyInversion(Bird b){
        this.b=b;

    }

    public static void  render (Bird b){
        System.out.println(b.color);
    }

    public static void main(String[] args) {
        Bird c=new Hen(12.34,"red");
        DependencyInversion d=new DependencyInversion(c);
        d.getClass();
        render(c);



    }

}

