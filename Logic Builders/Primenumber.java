public class Primenumber {
    public static void main(String args[])
    {
        int N=30;
        for(int i=1; i<N; i++ ){
        int flag=0;
        {
            for(int j=2; j<N; j++)
            {
                if(i%j==0)
                {
                     flag=1;
                    break;
                }

            }
            }
            if(flag==0)
            System.out.println(i);
        }
    }
}
