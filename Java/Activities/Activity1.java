package Activities;

public class Activity1
{
  public static void main (String[] args) {
      Car Carobj = new Car();
      Carobj.make = 2014;
      Carobj.color = "black";
      Carobj.transmission="Manual";
      Carobj.displayCharacteristics();
      Carobj.accelarate();
      Carobj.brake();

  }
}
