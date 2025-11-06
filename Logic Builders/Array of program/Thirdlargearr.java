public class Thirdlargearr {
   public static void main(String[] args) {
    int arr[]={10,30,50,40,70,100};
    int large=-1;
    int second=-1;
    int third=-1;
    int lenght=arr.length;
    for(int i=0;i<lenght;i++)
    {
        if(arr[i]>large)
        {
            third=second;
            second=large;

            
            large=arr[i];

        }else if(arr[i]>second && arr[i]!=large && arr[i]!=large)
        {
            third=second;
            second=arr[i];
        }else if(arr[i]>third && arr[i]!=second && arr[i]!=second )
        {
            third=arr[i];
        }
    }
    System.out.println(third);
   } 
}
