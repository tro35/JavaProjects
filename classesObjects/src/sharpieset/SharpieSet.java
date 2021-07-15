package sharpieset;

import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class SharpieSet {
    public String name;
    public List<Sharpie> sharpies;

    public SharpieSet(String name){
        this.sharpies = new ArrayList();
        this.name = name;
    }

    public void addSharpie(Sharpie sharpie){
        this.sharpies.add(sharpie);
    }

    public int countUsable(){
        int counter = 0;
        for (Sharpie usable : this.sharpies){
            if(usable.inkAmount != 0){
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash(){
        for (int i = 0; i < sharpies.size(); i++){
            if(sharpies.get(i).inkAmount == 0){
                sharpies.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "color='" + name + '\'' +
                ", sharpies=" + sharpies +
                '}';
    }
}



