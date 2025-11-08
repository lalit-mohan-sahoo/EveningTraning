import java.util.*;

public class Arrayobj {
        int x;
         
        Scanner Sc=new Scanner(System.in);
        void in()
        {
            System.out.println("enter a no");
            x= Sc.nextInt();
        }
		//display method
			void dis(){
	          	 System.out. println("number is :"+x);
}
        public static void main(String args[])
        {
            Arrayobj obj[]=new Arrayobj[5];
            for(int i=0; i<5; i++)
            {
                obj[i]=new Arrayobj();
                obj[i].in();
                obj[i].dis();
            }
        }
    
}
