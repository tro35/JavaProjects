package petrolstation;

public class Station {
    int gasAmount = 1000;

    public void refill(Car car){
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }

    public String toString() {
        return "Gas amount: " + this.gasAmount;
    }

}
