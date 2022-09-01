

public class FactoryLesson {
    public static void main(String[] args){
        Factory my_factory = new Factory();
        Car toyota = my_factory.create("Toyota");
        toyota.drive();
        Car audi = my_factory.create("Audi");
        audi.drive();
        Car tank = my_factory.create("Tank");
        tank.drive();
        Car lexus = my_factory.create("Lexus");
        lexus.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class Lexus implements Car {
    @Override
    public void drive() {
        System.out.println("drive Lexus");
    }
}

class Tank implements Car {
    @Override
    public void drive() {
        System.out.println("drive tank");
    }
}

class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            case "Lexus" : return new Lexus();
            case "Tank" : return new Tank();
            default : return null;
        }
    }
}