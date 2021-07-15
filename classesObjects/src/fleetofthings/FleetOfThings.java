package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove obstacles");
        Thing thing3 = new Thing("Stand up");
        Thing thing4 = new Thing("Eat Lunch");
        thing3.complete();
        thing4.complete();

        Fleet fleet = new Fleet();
        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);

        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}