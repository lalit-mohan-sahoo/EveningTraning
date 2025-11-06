public class Neonnum {
    public static void main(String args[])
    {
        int n=9;
        int square=n*n;
        int temp=square;
        int sum=0;
        while(temp!=0)
        {
            int r=temp%10;
             sum=sum+r;
             temp=temp/10;
        }
        if (sum==n) 
        {
            System.out.println("neon");          
        }else{
            System.out.println("not neon");
        }
    }
}
