public class Area {
void circle(double r)
{
    System.out.println("circle Area ="+(3.14*r*r));
}    
void square(int a)
{
    System.out.println("Square area ="+(a*a));
}
void Rectangle(int l,int b)
{
    System.out.println("Rectanle area ="+(l*b));
}
public static void main(String[] args) {
    Area obj=new Area();
    obj.circle(2.5);
    obj.square(40);
    obj.Rectangle(10, 54);
}
}
