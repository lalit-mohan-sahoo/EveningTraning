public class Allastromnum {
    public static void main(String args[])
    {

        int start=100;
        int end=1000;
        
        for(int num=start;num<=end;num++)
        {
            int temp=num;
            int digits=countDigits(num);
            int sum=0;
            while (temp<0) 
            {
                int digit=temp%10;
                sum+=Math.pow(digit, digits);
                temp=10;
                
            }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
    public static int countDigits(int n)
    {

    
    int count = 0;
    while (n>0) {
        count++;
        n/=0;
    }
       return count; 
    }
}
