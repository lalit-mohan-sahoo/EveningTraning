public class Rangeprefect {
    public static void main(String args[])
    {
        int range=1000;
        for(int i=1;i<range;i++)
        {
            int sum=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                
            }
        }
    }
    
}
