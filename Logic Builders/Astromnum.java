public class Astromnum {
    public static void main(String args[]){
        int digits=0;
        int n=153;
        int t=n;
        int sum=0;
        
        while(t!=0)
        {
            t=t/10;
            digits++;
        }
        System.out.println("no of digits"+digits);
        t=n;
        while (t!=0) {
            int r=t%10;
            sum=sum+(int)Math.pow(r,digits);
            t=t/10;
            
            
        }
        if(sum==n)
        {
            System.out.println("the number is asmstrom");
        }else{
            System.out.println("the number isnot asmstrom");

        }
    }
}
