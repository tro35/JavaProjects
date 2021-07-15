package GardenApplication;

import java.util.ArrayList;
import java.util.List;


public class Garden {
    public List<Plant> gardenPlants;

    public Garden() {
        this.gardenPlants = new ArrayList<>();
    }

    public void addPlant(Plant gardenPlant) {
        gardenPlants.add(gardenPlant);
    }

    public void resultGardenPrint() {
        for (Plant plant : this.gardenPlants) {
            plant.resultGardenPrint();
        }
        System.out.println();
    }

    public void water(int waterAmount) {
        int waterCounter = 0;
        for (Plant plant : this.gardenPlants) {
            if (plant.waterState.equals("needs")) {
                waterCounter++;
            }
        }
        System.out.println("Watering with " + waterAmount);
        if (waterCounter > 0) {
            for (Plant plant : this.gardenPlants) {
                if (plant.needsWater) {
                    plant.watering(waterAmount / waterCounter);
                    plant.needsWater = !(plant.currentWater > plant.minWater);
                    plant.waterState = plant.getWaterState();
                }
            }
        } else {
            System.out.println("No plants to water");
        }
        this.resultGardenPrint();
    }
}
