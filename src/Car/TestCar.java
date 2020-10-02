package Car;

public class TestCar {

    public static void main(String[] args) {
        Car bimmer = new Car("BMW","ABC12345","Red");
        Car rolls = new Car("BMW","ABC12345","Red");
        System.out.println(bimmer);
        System.out.println(rolls);

        if (bimmer.alikeCar(rolls));


    }

}
