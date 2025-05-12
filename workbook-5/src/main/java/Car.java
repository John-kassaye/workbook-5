public class Car extends Vehicle{
    private int wheel;
    private int doors;

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void test(){
        System.out.println(" color: " + getColor() + " door: " + getDoors() + " cargo capacity: " + getCargoCapacity() + " fuel capacity " + getFuelCapacity());
    }
}
