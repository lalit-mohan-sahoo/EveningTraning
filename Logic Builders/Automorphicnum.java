public class Automorphicnum {
    public static void main(String args[])
    {
        int n=9;
        int digits=0;
        int t=n;
        
        while (t!=0)
         {
            t=t/10;
            digits++;

        }
        int square=n*n;
        int temp=(int)Math.pow(10,digits);
        int result=square%temp;
        if(n==result)
        {
            System.out.println("automorphic");
        }else{
            System.out.println("not automoprhic");
        }
            
        
    }
    
}
