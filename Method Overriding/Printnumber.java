class A{
    int show()
    {
        return 10;
    }
}
class B extends A{
    @Override
    int show()
    {
        return 20;
    }
} 
public class Printnumber {
    public static void main(String[] args) {
        A obj=new B();
        System.out.println(obj.show());
    }
}
