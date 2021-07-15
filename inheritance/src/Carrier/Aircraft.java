package Carrier;

public class Aircraft {
    protected int maxAmmo;
    protected int baseDamage;
    protected boolean isPriority;
    protected int ammoStorage;
    protected int ammoToFill;
    protected int ammoToReturn = ammoToFill - maxAmmo;
    protected int allDamage = maxAmmo * baseDamage;

    public Aircraft() {
    }

    public void getStatus() {
        System.out.println("Type: " + getClass().getSimpleName() + " Ammo " + this.maxAmmo + " Base damage " + this.baseDamage
                + " All Damage " + this.maxAmmo * this.baseDamage);
    }

    public void getType() {
        System.out.println("Type: " + getClass().getSimpleName());
    }

    public void fight() {
        System.out.println("Damage" + ammoStorage * baseDamage + "!");
        ammoStorage = 0;
    }

    public void refill(int ammoToFill){
        if(ammoToFill > maxAmmo){
            ammoStorage = maxAmmo;
            ammoToReturn = (ammoToFill - maxAmmo);
            System.out.println("Refilling... Ammo to return: " + (ammoToReturn) + ".");
        }else if(ammoToFill < maxAmmo){
            ammoStorage = ammoStorage+ ammoToFill;
            System.out.println("Refilling... No ammo to return");
        }
    }

    public int getActualAmmo() {
        return ammoStorage;
    }

}
