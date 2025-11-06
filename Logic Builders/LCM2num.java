public class LCM2num {
    public static void main(String args[])
    {
        int a=54;
        int b=34;
        int max;
        int LCM;
        if(a>b)
        max=a;
        else
        max=b;
        while(true)
        {
        if(max % a==0 && max % b==0)
        {
            LCM =max;
            break;
        }
        max=max+1;
    }
    
    System.out.println(LCM);


    }
}
