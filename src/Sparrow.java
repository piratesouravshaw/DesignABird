public class Sparrow extends Bird implements Fly{
    FlyingBehaviour flyBehaviour;
    Sparrow(FlyingBehaviour flyBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
    }
    @Override
    public void fly() {
        this.flyBehaviour.howFly();
    }
}
