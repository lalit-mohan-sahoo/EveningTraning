public class Methodoverloading
{
    void show(String s1)
    {
        System.out.println(s1);
    }
    void show(String s2,String s3)
    {
        System.out.println("\n my friend name is: " +s2+ "\n my third friend name is: "+ s3);

    }

 
    public static void main(String[] args) {
        Methodoverloading obj=new Methodoverloading();
        obj.show("Lalit");
        obj.show("Rakesh", "Bapi");
    }
}
