public class primenum {
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[]);
        
        int i,j;
        
        for(i=2; i<n; i++)
        {
            boolean isprinme=true;
            for(j=2; j<n; j++)

            {
                isprinme=false;
                break;
            }
        }
        if(i%j==0)
        {
            System.out.println(i);
        }
    }
}
