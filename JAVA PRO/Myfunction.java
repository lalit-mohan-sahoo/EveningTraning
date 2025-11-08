class A
{
void show()
{
System.out.println("I am in supperclass");


}
class B extends A
{
void show()
{
super.show();
System.out.println("I am in subclass"); 
}

} 
public class Myfunction
{
public static void main(String args[])
{
B obj=new B();
obj.show();
}
}