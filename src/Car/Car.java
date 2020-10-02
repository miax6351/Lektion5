package Car;


public class Car {

    String brand;
    String plate;
    String color;

    public Car(String brand, String plate, String color){
        this.brand = brand;
        this.plate = plate;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "[" + getPlate() + "] " + getColor() + " " + getBrand();
    }

    public boolean isSamePlate(Car other){
        if(this.getPlate().compareTo(other.getPlate()) == 0){
            return true;
        }
        return false;
    }
    public boolean isSameBrand(Car other){
        if(this.getBrand().compareTo(other.getBrand()) == 0){
            return true;
        }
        return false;
    }

    public boolean alikeCar(Car other){
        if (this.getColor().compareTo(other.getColor()) == 0 && isSameBrand(other) == true) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }


}