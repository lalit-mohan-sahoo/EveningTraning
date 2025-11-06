public class Sumdigits {
    public static void main(String args[])
    {
        int N=5;
        int sum=0;
        int i;
        while(N>0)
        {
            i=N % 10;
            if(i % 2==0)
            {
                sum=sum+i;
                N=N/10;
                
            }
        }
        System.out.println(""+sum);
    }
}
