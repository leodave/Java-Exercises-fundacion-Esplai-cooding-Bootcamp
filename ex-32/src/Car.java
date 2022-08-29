public class Car {
    private int fuel;
    private int maxSpeed;

    public Car(int fue, int maxy) {
        fuel = fue;
        maxSpeed = maxy;
        System.out.println(fuel);
        System.out.println(maxSpeed);
    }

    public void Car(){
        System.out.println("Mercedes");
    }
    public int refuel( int fueled){
         fuel = fuel + fueled;
         return fuel;
    }
    public int getFuel(){
        return fuel;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public int setMaxSpeed(int max){
        this.maxSpeed = max;
        return maxSpeed;
    }

    public static void main(String[] args) {
        Car car = new Car(20,20);
        car.setMaxSpeed(50);
        System.out.println(car.getMaxSpeed());

    }
}
