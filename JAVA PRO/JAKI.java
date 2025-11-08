 class C{
    int x=2;

}
class B extends C
{
    int x=20;
    void show()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class JAKI
{

public static void main(String args[])
{
    B obj=new B();
    obj.show();
}
}
