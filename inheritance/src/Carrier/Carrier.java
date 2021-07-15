package Carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> aircrafts;
    protected int ammo;
    protected int hp;

    public Carrier(int ammo, int hp) {
        this.ammo = ammo;
        this.hp = hp;
        this.aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }

    public void fill(){
        for(Aircraft aircraft: aircrafts){
            aircraft.ammoStorage += aircraft.maxAmmo;
            ammo -= aircraft.maxAmmo;
        }
    }
}
