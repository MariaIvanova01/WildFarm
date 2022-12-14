package wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        setBreed(breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }

    @Override
    public void eat(Food food) {
        //eat everything
        setFoodEaten(food.quantity);

    }

    @Override
    public String toString(){
        DecimalFormat format = new DecimalFormat("###.##");
        return String.format("%s[%s, %s, %s, %s, %d]",getAnimalType(),getAnimalName(),getBreed(),format.format(getAnimalWeight()),getLivingRegion(),getFoodEaten());
    }
}
