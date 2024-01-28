public class Vehicle {
    public void drive(){
        System.out.println("Am the Boss!");
    }
}
class Audi extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving 160kmph");
    }
}
class BMW extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving 140kmph");
    }
}
class Benz extends Vehicle{
    @Override
    public void drive() {
       super.drive(); System.out.println("Driving 120kmph");
    }
}
class Honda extends Benz{
    @Override
    public void drive() {
       super.drive(); System.out.println("Drive 100kmph");
    }
}
class Test2{
    public static void main(String[] args) {
        Vehicle v;
        v = new Audi();
        v.drive();
        v = new BMW();
        v.drive();
        v = new Benz();
        v.drive();
        Benz b = new Honda();
        b.drive();
    }
}