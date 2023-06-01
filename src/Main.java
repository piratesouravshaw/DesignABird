// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pigeon p=new Pigeon();
        p.canEat();
        p.canMakeSound();
        p.fly();
        Sparrow sp=new Sparrow(new CrowSparrowFlyingBehaviour());
        sp.fly();
    }
}
