public class Pigeon extends Bird implements Fly{
    Fly flyBehaviour;
    Pigeon(Fly beh)
    {
        this.flyBehaviour=beh;
    }
    public void fly()
    {
        this.flyBehaviour.fly();
    }
}
