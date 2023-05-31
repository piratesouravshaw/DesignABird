public class Crow extends Bird implements Fly{
    Fly flyBehaviour;
    Crow(Fly flyBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
    }
    @Override
    public void fly() {
            this.flyBehaviour.fly();
    }
}
