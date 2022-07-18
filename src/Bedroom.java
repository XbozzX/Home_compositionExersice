public class Bedroom {

    private Dimesion wall;
    private Fan fan;

    public Bedroom(Dimesion wall, Fan fan){
        this.wall = wall;
        this.fan = fan;
    }

    public void TurnOn(int speed){
        fan.fanTurnOn();
        FanSpeed(speed);
    }

    private void FanSpeed(int speed){
        fan.adjustSpeedFan(speed);
    }
}
