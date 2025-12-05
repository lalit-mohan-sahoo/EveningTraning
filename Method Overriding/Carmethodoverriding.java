class vehicle
{
    String model()
    {
        return ("Genertic vehicle");
    }
}
class Car extends vehicle
{
    String model()
    {
        return ("fourwheiler");
    }
}
public class Carmethodoverriding {
    public static void main(String[] args) {
        vehicle obj =new Car();
       System.out.println(obj.model());
    }
}
