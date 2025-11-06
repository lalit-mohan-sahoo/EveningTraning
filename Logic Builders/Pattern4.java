public class Pattern4 {
    public static void main(String args[])
    {
        int i;
        int j;
        int k;
        int n=4;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
