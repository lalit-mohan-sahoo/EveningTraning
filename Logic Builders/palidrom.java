public class palidrom {
    public static void main(String args[])
    {
        int N=321;
        int rev=0;
        int temp=N;
        while(N>0)
        {
            rev=rev*10+( N % 10 );
            N=N/10;
        }
        if(rev==temp)
        {
            System.out.println("is palidrom");
        
        }else{
            System.out.println("is not palidrom");
        }
    }
}
