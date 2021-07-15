package petrolstation;

public class Car {
    int gasAmount;
    int capacity;

    public Car(int gasAmount, int capacity){
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }

    public String toString() {
        return "Gas amount: " + this.gasAmount + " Capacity: " + this.capacity;
    }
}
