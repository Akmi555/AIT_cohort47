package lesson_21.transport;
/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class VehicleWithEngine extends Vehicle{

    @Override
    public void startEngine() {
        if (getEngine() != null) {
            getEngine().start();
        }
    }

    @Override
    public void stopEngine() {
        if (getEngine() != null){
            getEngine().stop();
        }
    }
}
