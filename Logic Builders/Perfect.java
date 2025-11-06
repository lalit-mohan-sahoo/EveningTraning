public class Perfect {
    public static void main(String args[])
    {
        int n=28;
        int m=n;
        int sum=0;
        for(int i=1;i<=m/2;i++)
        {
            if(m%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("prefect");
        }else{
            System.out.println("not prefect");
        }
    }
}
