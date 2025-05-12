public class main {
    public static void main(String[] args) {
        Moped ride = new Moped();
        ride.setColor("Red");
        ride.setFuelCapacity(5);
        ride.test();

        Car car = new Car();
        car.setDoors(2);
        car.setCargoCapacity(300);
        car.setFuelCapacity(1000);
        car.setColor("blue");
        car.test();

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setDoors(4);
        semiTruck.setCargoCapacity(1222);
        semiTruck.setFuelCapacity(400);
        semiTruck.setColor("black");
        semiTruck.test();

    }
}
