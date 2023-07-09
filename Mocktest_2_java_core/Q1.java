class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow mooes");
    }
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); 

        Dog dog = new Dog();
        dog.makeSound(); 

        Cat cat = new Cat();
        cat.makeSound(); 

        Cow cow = new Cow();
        cow.makeSound(); 
    }
}
