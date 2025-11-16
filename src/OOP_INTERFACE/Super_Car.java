package OOP_INTERFACE;

public class Super_Car{
    private Engine engine;
    private Media cd;

    public Super_Car(){
        engine = new Power_Engine();
        cd = new Media_Player();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMedia(){
        cd.startMedia();
    }
    public void stopMedia(){
        cd.stopMedia();
    }
    public void changeEngine(){
        this.engine = new Electric_Engine();
    }
}
