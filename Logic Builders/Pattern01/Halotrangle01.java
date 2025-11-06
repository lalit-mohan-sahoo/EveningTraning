public class Halotrangle01 {
    public static void main(String args[])
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                if (i==n||k==1||k==(2*i-1)) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
