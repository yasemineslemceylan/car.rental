public class Car {

    private String brand;
    private String model;
    private boolean available;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.available = true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}