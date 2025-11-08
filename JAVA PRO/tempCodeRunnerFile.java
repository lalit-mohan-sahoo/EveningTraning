class Sumint extends Thread
{
    int start;
    int end;
    int sum=0;

public void run()
{
    for(int i=start;i<end;i++)
    {
        sum=sum+i;
    }
}
}
public class Myakasha
{
    public static void main(String args[])
    {
        Sumint obj1=new Sumint(22,45);
        Sumint obj2=new Sumint(23,34);
    }
    int total=obj1+obj2;
}
