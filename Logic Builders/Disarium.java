public class Disarium {
    public static void main(String args[])
    {
        int n =135;
        int sum=0;
        int temp=n;
        int digit=0;
        while (temp>0) {
            temp=temp/10;
            digit++;
            
        }
        temp=n;
        int r=0;
        while (temp!=0) {
            r=temp%10;
            sum+=Math.pow(r,digit);
            digit--;
            temp/=10;
            
        }
        if (sum==n) {
            System.out.println("Disarinum number");
            
        }else{
            System.out.println("not disarinum number");
        }
    }
}
