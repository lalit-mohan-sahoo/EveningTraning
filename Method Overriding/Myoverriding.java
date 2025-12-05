class A
{
    void show()
    {
        System.out.println("I am in supper class");
    }
}
class B extends A{
    void show()
    {
        System.out.println("I am in sub class");
    }
}

public class Myoverriding {
    
    public static void main(String args[])
    {
        A obj =new A();        
        obj.show();
        B obj1=new B();
        obj1.show();
    }
}
