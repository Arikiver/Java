public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

// Base class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
