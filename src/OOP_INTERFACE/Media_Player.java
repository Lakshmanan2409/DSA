package OOP_INTERFACE;

public class Media_Player implements Media{
    @Override
    public void startMedia() {
        System.out.println("Media player starts ");
    }

    @Override
    public void stopMedia() {
        System.out.println("Media player stops ");
    }
}
