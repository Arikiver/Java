class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
  }

  class finalDemo extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        finalDemo myFastCar = new finalDemo();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }