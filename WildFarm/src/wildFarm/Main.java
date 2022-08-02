package wildFarm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            String[] inputAnimalInfo = scan.nextLine().split(" ");

            if (inputAnimalInfo[0].equals("End")){
                break;
            }

            if (inputAnimalInfo[0].equalsIgnoreCase("cat")){
                Felime cat = new Cat(inputAnimalInfo[1],inputAnimalInfo[0], Double.parseDouble(inputAnimalInfo[2]),inputAnimalInfo[3],inputAnimalInfo[4]);
                cat.makeSound();
                inputAnimalInfo = scan.nextLine().split(" ");
                if (inputAnimalInfo[0].equalsIgnoreCase("meat")){
                    Food food = new Meat(Integer.parseInt(inputAnimalInfo[1]));
                    cat.eat(food);
                }else{
                    Food food = new Vegetable(Integer.parseInt(inputAnimalInfo[1]));
                    cat.eat(food);
                }
                System.out.println(cat);
            }else if (inputAnimalInfo[0].equalsIgnoreCase("tiger")){
                Felime tiger = new Tiger(inputAnimalInfo[1],inputAnimalInfo[0], Double.parseDouble(inputAnimalInfo[2]),inputAnimalInfo[3]);
                tiger.makeSound();
                inputAnimalInfo = scan.nextLine().split(" ");
                try {
                    if (inputAnimalInfo[0].equalsIgnoreCase("Meat")){
                        Food food = new Meat(Integer.parseInt(inputAnimalInfo[1]));
                        tiger.eat(food);
                    }else{
                        Food food = new Vegetable(Integer.parseInt(inputAnimalInfo[1]));
                        tiger.eat(food);
                    }

                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                System.out.println(tiger);

            }else if (inputAnimalInfo[0].equalsIgnoreCase("zebra")){
                Mammal zebra = new Zebra(inputAnimalInfo[1],inputAnimalInfo[0], Double.parseDouble(inputAnimalInfo[2]),inputAnimalInfo[3]);
                zebra.makeSound();
                inputAnimalInfo = scan.nextLine().split(" ");
                try {
                    if (inputAnimalInfo[0].equalsIgnoreCase("vegetable")) {
                        Food food = new Vegetable(Integer.parseInt(inputAnimalInfo[1]));
                        zebra.eat(food);
                    }else {
                        Food food = new Meat(Integer.parseInt(inputAnimalInfo[1]));
                        zebra.eat(food);
                    }
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                System.out.println(zebra);

            }else if (inputAnimalInfo[0].equalsIgnoreCase("mouse")){
                Mammal mouse = new Mouse(inputAnimalInfo[1],inputAnimalInfo[0], Double.parseDouble(inputAnimalInfo[2]),inputAnimalInfo[3]);
                mouse.makeSound();
                inputAnimalInfo = scan.nextLine().split(" ");
                try {
                    if (inputAnimalInfo[0].equalsIgnoreCase("vegetable")) {
                        Food food = new Vegetable(Integer.parseInt(inputAnimalInfo[1]));
                        mouse.eat(food);
                    }else{
                        Food food = new Meat(Integer.parseInt(inputAnimalInfo[1]));
                        mouse.eat(food);
                    }
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                System.out.println(mouse);
            }
        }
    }
}
