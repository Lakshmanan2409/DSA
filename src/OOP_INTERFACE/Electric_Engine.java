package OOP_INTERFACE;

public class Electric_Engine implements Engine,Media{
    @Override
    public void start() {
        System.out.println("Electric engine starts ");
    }

//    public Electric_Engine(int val) {
//    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops ");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine Accelerate ");
    }
    @Override
    public void startMedia() {
        System.out.println("Electric Engine Media On");
    }

    @Override
    public void stopMedia() {
        System.out.println("Electric Engine Media Off");
    }
}
