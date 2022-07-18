public class Dimesion {

    private double length;
    private double width;
    private double area;

    public Dimesion(double length, double width, double area){
        this.length = length;
        this.width = width;
        this.area = area;
    }

    public double getDimesion(){
        return length * width * area;
    }
}
