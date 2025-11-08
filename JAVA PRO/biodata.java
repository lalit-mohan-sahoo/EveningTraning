public class Biodata{
public Static void main(String[]args)
   {
if(args.lenght<4){
   System.out.println("please pass:NAME,BARNCH,ADDRESS,AGE");
        return;
}
    String name = args[0];
    String age = args[1];
    String branch = args[2];
    String address = args[3];
 
  System.out.println(" 	BIODATA   ");
  System.out.println("NAME: LALAIT MOHAN SAHOO"+name);
  System.out.println("AGE:19"+age);
  System.out.println("Branch: CST"+brach);
System.out.println("Address:Nlida,po:shia,Disict:jajpur"+address);
}
}