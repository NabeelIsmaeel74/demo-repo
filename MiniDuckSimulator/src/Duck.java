public class Duck {
    public FlyBehavior flyBehavior ;
    public   QuackBehavior quackBehavior ;

    public  void swim() {
        System.out.println("I can swim ");
    }

    public void  display() { }

    public  void  performQuack() {}
    public void  performFly() {}

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior ;
    }

    public  void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior ;
    }

}
