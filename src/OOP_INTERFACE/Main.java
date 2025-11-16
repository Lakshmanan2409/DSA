package OOP_INTERFACE;

public class Main {
    public static void main(String[] args) {
        Engine a = new Power_Engine();
        a.start();
//        a.startMedia();
        a.acc();
//        a.stopMedia();
        a.stop();

        System.out.println();

        Super_Car b = new Super_Car();
        b.start();
        b.startMedia();
        b.acc();
        b.stopMedia();
        b.stop();

        System.out.println();
        b.changeEngine();

        b.start();
        b.startMedia();
        b.acc();
        b.stopMedia();
        b.stop();
    }
}
