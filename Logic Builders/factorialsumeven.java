public class factorialsumeven {
    public static void main(String args[])
    {
        int N=10;
        int a=0;
        int b=1;
        int sum=0;
        int temp;
        System.out.println(a+""+b);
        while(a<=N)
        {
            if(a % 2==0)
            sum=sum+a;
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(""+sum);
    }
}
