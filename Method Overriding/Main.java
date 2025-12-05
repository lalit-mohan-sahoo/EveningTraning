class parent{
    double value()
    {
        return 5.5;
    }
}
class chiid extends parent
{
    @Override
    double value()
    {
        return 9.9;
    }
}
public class Main {
    public static void main(String[] args) {
        parent obj=new chiid();
        System.out.println(obj.value());
    }
}
