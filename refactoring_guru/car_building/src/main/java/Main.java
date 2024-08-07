import builder.CarBuilder;
import builder.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Main {
    public static void main(String[] args) {
        
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built: \n" + car.toString());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\n Car manual built:\n" + manual.print());
    }
}