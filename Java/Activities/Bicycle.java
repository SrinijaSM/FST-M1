package Activities;

import java.sql.SQLOutput;

class Bicycle implements BicycleParts,BicyclOperations {
    public int gears;
    public int currentSpeed;

    Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.currentSpeed =currentSpeed;
    }


    public void applybrake(int decrement){
        currentSpeed -=currentSpeed;
        System.out.println("Current Speed:= "+currentSpeed);
    }

    public void speedUp(int increment){
        currentSpeed+=currentSpeed;
        System.out.println("Current Speed:= " +currentSpeed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}