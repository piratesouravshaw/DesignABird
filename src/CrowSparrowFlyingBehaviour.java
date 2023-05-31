public class CrowSparrowFlyingBehaviour extends DefaultFlyingBehaviour implements Fly {
    @Override
    public void fly() {
        System.out.println("I am flying by CrowSparrowFlyingbehaviour"+this.getClass());
    }
}
