class Animal
{
    String sound()
    {
        return ("animal makes sound");
    }
}
class Dog extends Animal
{
    String sound()
    {
        return("Dog barks");
    }
}
public class Samereturntype {
    public static void main(String[] args) {
        Animal obj=new Dog();
        System.out.println(obj.sound());
    }
}
