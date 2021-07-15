package GardenApplication;

public class Plant {
    private String color;

    double currentWater;
    double minWater;
    String waterState;
    double absorptionNumber;
    boolean needsWater;

    // constructors
    public Plant(String color, double currentWater, double minWater, double absorptionNumber) {
        this.color = color;
        this.currentWater = currentWater;
        this.minWater = minWater;
        this.needsWater = setNeedsWater();
        this.waterState = this.getWaterState();
        this.absorptionNumber = absorptionNumber;
    }

    public String getWaterState() {
        if(this.currentWater > this.minWater){
            return "doesnt need";
        }
        else{
            return "needs";
        }
    }

    private boolean setNeedsWater() {
        return !(this.currentWater > this.minWater);
    }



    public void watering(double waterAmount) {
        this.currentWater += waterAmount * this.absorptionNumber;
    }




    public void resultGardenPrint() {
        System.out.println("The " + this.color + " " + this.getClass().getSimpleName() + " "
                + this.waterState + " water");
    }
}
