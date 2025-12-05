public class DifferntString {
    void show(String a)
    {
        System.out.println(a);
    }
    void show(String b,String c)
    {
        System.out.println(b +" "+c);
    }
    public static void main(String[] args) {
        DifferntString obj=new DifferntString();
        obj.show("Lalit");
        obj.show("Mohan", "Sahoo");
    }
}
