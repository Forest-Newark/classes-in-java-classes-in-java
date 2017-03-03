/**
 * Create the most minimal class you can. The class must be named "Animal"
 * because it must match the file name.
 */

public class Animal {

    private String mAnimalType;
    private int mAnimalAge;
    public Animal(String animalType,int animalAge) {
        mAnimalType = animalType;
        mAnimalAge = animalAge;

    }
    @Override public String toString() {
       return ("Look its a " + this.mAnimalAge + " year old " + this.mAnimalType + "!" + " How cool!");

    }



}
