package Activities;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int seatHeight){
        super(gears, currentSpeed);
        this.seatHeight= seatHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return(super.bicycleDesc()+"\nSeat Height " + seatHeight);
    }

    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applybrake(5);
    }
}
