abstract class A
{
abstract  void show();
}
class B extends A
{
void show()
{
System.out.println("NIT");
}
}
class C extends A
{
void show()

{
System.out.println("LALIT");
}
}
public class Myname
{
public static void main(String args[])
{
B obj=new B();
C obj1=new C();
obj.show();
obj1.show();
}
}