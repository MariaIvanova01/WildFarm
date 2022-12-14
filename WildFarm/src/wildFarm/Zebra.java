package wildFarm;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        //only vegetables
        if (food instanceof Vegetable){
            setFoodEaten(food.quantity);
        }else{
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }

    }
}
