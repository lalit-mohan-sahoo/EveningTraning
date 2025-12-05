public class Displaydifferntarrgument {
    void show(int a)
    {
        System.out.println("Interger: "+a);
    }
    void show(double b)
    {
        System.out.println("Double: "+b);
    }
    void show(String c)
    {
        System.out.println("String:" +c);
    }


 
    public static void main(String[] args) {
         Displaydifferntarrgument obj=new Displaydifferntarrgument();
         obj.show(100);
         obj.show(12.5);
         obj.show("Lalit");
    }
}

