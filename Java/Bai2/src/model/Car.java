package model;

public class Car {
    private String model;
    private String make;
    private String color;
    private int door;


    public Car() {
        super();
    }

    public Car(String make, String model, String color, int door){
        super();
        this.make = make;
        this.model = model;
        this.color =  color;
        this.door = door;

    }
    //Method
    void showCar(){
        System.out.format("Make: %s \nModel: %s \nColor: %s \nDoor: %d", this.make, this.model,this.color,this.door);
    }
    public static void main(String[] args) {
        Car c = new Car("Porsche", "Panamera", "Black", 4);
        c.showCar();
    }
}


