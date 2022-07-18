public class Main {
    public static void main(String[] args) {
        Dimesion dimesion = new Dimesion(20, 20 , 5);
        Fan fan = new Fan(false);
        Bedroom bedroom = new Bedroom(dimesion, fan);

        dimesion.getDimesion();
        bedroom.TurnOn(2);
    }
}