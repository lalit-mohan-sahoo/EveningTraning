class college
{
    void show()
    {
        System.out.println("NIT");
    }
}
class Branch{
    void s()
    {
        System.out.println("CST");
    }
}
public class Displaymethod {
    public static void main(String[] args) {
        college obj=new college();
        obj.show();
        Branch obj1=new Branch();
        obj1.s();
    }
}
