import java.security.PublicKey;

public class Fan {

    private Boolean isFanOn;

    public Fan(Boolean isFanOn){
        this.isFanOn = isFanOn;
    }

    public void fanTurnOn(){
        System.out.println("Fan is turning on");
        this.isFanOn = true;
    }

    public void adjustSpeedFan(int fanSpeed){
        if (this.isFanOn != true){
            System.out.println("Please turn on the fan first");
        } else {
            if (fanSpeed == 0){
                System.out.println("Fan current speed is " + fanSpeed);
            } else if (fanSpeed == 1){
                System.out.println("Fan current speed is " + fanSpeed);
            } else if (fanSpeed == 2){
                System.out.println("Fan current speed is " + fanSpeed);
            } else if (fanSpeed == 3){
                System.out.println("Fan current speed is " + fanSpeed);
            } else if (fanSpeed == 4){
                System.out.println("Fan current speed is " + fanSpeed);
            } else {
                System.out.println("Fan just only have 4 speed only");
            }
        }
    }




}
