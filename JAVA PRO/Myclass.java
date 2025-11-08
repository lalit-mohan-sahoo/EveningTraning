abstract class AB
{
abstract void show();
void display()
{
System.out.println("wellcome to ME");
}
}
class B extends AB
{
void show()
{
System.out.println("i am in subclass");
}
} 
class C extends AB
{
void show()
{
System.out.println("Wellcome to CSE");
}
void display()
{
System.out.println("👋");
}
}
public class Myclass
{
public static void main(String args[])
{
B obj=new B();
C obj1=new C();
obj.show();
obj.display();
obj1.show();
obj1.display();

}
}