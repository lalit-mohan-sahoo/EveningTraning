public class GCDnum {
    public static void main(String args[])
    {
        int a=45;
        int b=15;
        int temp;
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
