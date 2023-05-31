public class DefaultFlyingBehaviour implements Fly{
    @Override
    public void fly() {
        System.out.println("I am flying via Default Behaviour"+this.getClass());
    }
}
