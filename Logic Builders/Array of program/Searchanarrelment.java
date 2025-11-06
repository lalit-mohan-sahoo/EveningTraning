public class Searchanarrelment {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int lenght=arr.length;
        int key=30;
        int flag=0;
        for(int i=0;i<lenght;i++)
        {
            if(key==arr[i]){
            flag=1;
            break;
            }
            
        }
        if(flag==1)
        {
            System.out.println("element found");
        }else{
            System.out.println("not found ");
        }
    }
}
