public class Fibonacciseries {
    public static void main(String args[])
    {
        int N=10;
        int a=0;
        int b=1;
        int temp=0;
        System.out.println(a+""+b);
        
        while(true)
        {
           temp =a+b;
           if(temp>N)
           break;
           a=b;
           b=temp;
           System.out.println(""+temp);
        }
    }
}
