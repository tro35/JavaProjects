package counter;

public class Counter {
    int counter;

    public Counter(){
        this.counter = 0;
    }

    public void addNumber(int number){
        this.counter += number;
    }

    public void add(){
        this.counter += 1;
    }

    public int getValue(){
        return this.counter;
    }

    public void reset(){
        this.counter = 0;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }
}

