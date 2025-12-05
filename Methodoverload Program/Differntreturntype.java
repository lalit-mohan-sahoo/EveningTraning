public class Differntreturntype {
   int add(int x,int y)
   {
    return x+y;
   } 
   double add(double d1,double d2)
   {
    return d1+d2;
   }
   public static void main(String[] args) {
    Differntreturntype obj=new Differntreturntype();
    System.out.println(obj.add(45,45));
    System.out.println(obj.add(12.5,5.5));
   }
}
