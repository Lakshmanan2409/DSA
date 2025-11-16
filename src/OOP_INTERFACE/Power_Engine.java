package OOP_INTERFACE;

public class Power_Engine implements Engine,Media{
    @Override
    public void start() {
        System.out.println("Power engine starts ");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops ");
    }

    @Override
    public void acc() {
        System.out.println("Power engine Accelerate ");
    }

    @Override
    public void startMedia() {
        System.out.println("Power Engine Media On");
    }

    @Override
    public void stopMedia() {
        System.out.println("Power Engine Media Off");
    }
}
