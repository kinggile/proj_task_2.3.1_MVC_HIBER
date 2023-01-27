package LEGACY.Legacy;

public class Car {
    private String carModel;
    private int length;
    private int width;

    public Car() {
    }

    public Car(String carModel, int length, int width) {
        this.carModel = carModel;
        this.length = length;
        this.width = width;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
