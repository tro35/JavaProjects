package santafactory;

public class Toy {
    protected int cost;
    protected String color;
    protected String ownerName = null;
    protected int size;

    public Toy() {
    }

    public Toy(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public Toy(int cost, String color, int size) {
        this.cost = cost;
        this.color = color;
        this.size = size;

    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
