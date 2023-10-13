public class MainCar {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car car2 = new Car();
        car2.setMake("Porsche");
        car2.setModel("Carrera");
        car2.setDoors(2);
        car2.setConvertible(true);
        car2.setColor("black");
        System.out.println("make = " + car2.getMake());
        System.out.println("model = " + car2.getModel());
        car2.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
