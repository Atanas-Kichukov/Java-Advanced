package JavaOOP.Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length){
        if(!isValid(length)){
            throw new IllegalArgumentException("Length cannot be zero or negative");
        }
        this.length = length;
    }
    private void setHeight(double height) {
        if (!isValid(height)) {
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }
        this.height = height;
    }

    private void setWidth(double width){
        if(!isValid(width)){
            throw  new IllegalArgumentException("Width cannot be zero or negative");
        }
        this.width = width;
    }
    private boolean isValid(double val){
        return val> 0;

    }

    public double calculateSurfaceArea(){
        return  (2 * length * width) + calculateLateralSurfaceArea();
    }
    public double calculateLateralSurfaceArea(){

    return (2 * length * height) + (2 * width * height);
    }

    public double calculateVolume(){
    return length * height * width;
    }
}
