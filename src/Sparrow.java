public class Sparrow extends Bird implements Fly{
    Fly flyBehaviour;
    Sparrow(Fly flyBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
    }
    @Override
    public void fly() {
        this.flyBehaviour.fly();
    }
}
