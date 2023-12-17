

public class Main {
    public static void main(String[] args) {

        FlyingQuackingDuck obj = new FlyingQuackingDuck() ;
        obj.display();
        obj.performFly();
        obj.performQuack();
        FlyBehavior f = new FlyOnRocket();
        obj.setFlyBehavior(f);
        obj.performFly();

        System.out.println("__________________________________________________");

        RedHatDuck oo = new RedHatDuck() ;
        oo.display();
        oo.performFly();
        oo.performQuack();
        oo.setFlyBehavior(f);
        oo.performFly();
        QuackBehavior a = new Quack() ;
        oo.setQuackBehavior(a);
        oo.performQuack();

    }
}