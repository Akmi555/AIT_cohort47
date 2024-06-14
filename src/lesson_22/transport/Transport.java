package lesson_22.transport;
/*
@date 13.06.2024
@author Sergey Bugaienko
*/

public abstract class Transport {

    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassenger();

    public int getCapacity() {
        return capacity;
    }
}
