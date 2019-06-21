package checkbox;

import java.util.ArrayList;

public class Checkbox {

    private ArrayList<String> animals = new ArrayList<String>();

    public void addAnimal(String animal) {
        this.animals.add(animal); 
    }

    public ArrayList<String> getAnimals() {
        return this.animals;
    }

    
}