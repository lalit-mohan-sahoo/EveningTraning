public class Aramstrong {
    public static void main(String args[])
    {
        
        int end=1000;
        for(int num=1;num<= end; num++)
        {
            int sum=0;
            
            int temp=num;
            int digit=0;
            while (temp!=0) {
                 temp=temp/10;
                digit++;}
                temp=num;
                while (temp!=0) {
                    int r=temp%10;
                    sum=sum+(int)Math.pow(r,digit);
                    temp=temp/10;
                }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
    
}
