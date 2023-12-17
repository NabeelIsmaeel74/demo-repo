public class FlyingQuackingDuck extends Duck{

    public  FlyingQuackingDuck () {
        flyBehavior = new FlyWithWings() ;
        quackBehavior = new Quack() ;
    }

    @Override
    public  void display() {
        System.out.println("I am a FlyingQuacking Duck");
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();
    }
}
