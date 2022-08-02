package wildFarm;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        //only vegetables
        if (food instanceof Vegetable){
            setFoodEaten(food.quantity);
        }else{
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }
}
