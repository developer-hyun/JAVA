class Car {
    String color;
    String gearType;

    Car(){
        this("white","auto");
    }

    Car(String color, String gearType) {
        this.color = color;
        this.gearType = gearType;
    }

    Car(Car c) {
        this.color = c.color;
        this.gearType = c.gearType;

    }
}
class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

    }
}

