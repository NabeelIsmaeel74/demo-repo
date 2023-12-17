public class RedHatDuck extends Duck{

    public RedHatDuck() {
        flyBehavior = new FlyNoWay() ;
        quackBehavior = new MuteQuack() ;
    }

    @Override
    public void display() {
        System.out.println("I am ReadHat Duck");
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }
}
