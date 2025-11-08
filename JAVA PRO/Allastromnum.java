public class Allastromnum {
    public static void main(String args[])
    {
        int start=1;
        int end=1000;
        
        for(int i=start;i<=end;i++)
        {
            int temp=i;
            int digits=0;
            System.out.println(""+digits);
            int sum=0;
            while ((temp > 0)) {
                 int r=temp %10;
                 sum +=Math.pow(r,digits);
                 temp=10;
                 
                
            }
            if (sum==i) {
                System.out.println(i);
                
            }
        }
    }
}
