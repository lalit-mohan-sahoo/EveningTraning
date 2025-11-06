public class primenum {
    public static void main(String args[])
    {
        int n=10;
        int i;
        int j;
        boolean isprime;
        System.out.println("prime numbers from 1 to "+n+"are:");
        for( i=2; i<=n; i++)
        {
             isprime=true;
            for( j=2; j<=i/2; j++)
            {
                if(i % j==0)
                {
                    isprime=false;
                    break;
                }
            }
            if(isprime==true){
                System.out.println(i+"");
            }
        }
    }
}
