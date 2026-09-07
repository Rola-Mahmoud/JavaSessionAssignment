package Session6;

public class Zoo {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//        Animal animal = new Animal();
//        animal.makeSound();
        Animal animal = new Dog();
        animal.makeSound();
        ((Dog)animal).bite();
        feed(animal);
        animal = new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();
        feed(animal);


    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your Dog's Food");
        }else if(animal instanceof Cat){
            System.out.println("Here is your Cat's Food");
        }
    }
    public Animal polyMethod(int userChoice){
        Animal animal;
        if(userChoice == 1){
            animal = new Dog();
        }
        else{
            animal = new Cat();
        }
        return animal;
    }
}