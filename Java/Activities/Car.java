package Activities;

public class Car {
    String color, transmission;
    int make, tyers, doors;

      Car()
    {
        tyers=4;
        doors=4;
    }

    public void displayCharacteristics()
    {
        System.out.println("Color = "+color);
        System.out.println("Transmition = "+transmission);
        System.out.println("Make = "+make);
        System.out.println("Tyers = "+tyers);
        System.out.println("Doors ="+doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }

    }

