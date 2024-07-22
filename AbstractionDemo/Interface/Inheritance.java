package AbstractionDemo.Interface;

// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

  // Pig "implements" the Animal interface
  // --  in interfaces we use the keyword "implements" rather then "extends" like you would in the case of inheritance
class Pig implements Animal {
    @Override
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    @Override
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
}

public class Inheritance {
    public static void main(String[] args) {
      Pig myPig = new Pig();  // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
}