public class Crow extends Bird implements Fly{
    FlyingBehaviour flyBehaviour;
    Crow(FlyingBehaviour flyBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
    }
    @Override
    public void fly() {
            this.flyBehaviour.howFly();
    }
}
