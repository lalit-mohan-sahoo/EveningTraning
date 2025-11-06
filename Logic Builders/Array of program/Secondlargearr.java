public class Secondlargearr {
    public static void main(String[] args) {
        int arr[]={10,20,70,70,30,60,80};
        int large=-1;
        int secondlarge=-1;
        int lenght=arr.length;
        for(int i=0;i<lenght;i++)
        {
            if(arr[i]>large)
            {
                 secondlarge=large;
                large=arr[i];
               
            }else if(arr[i]>secondlarge && arr[i]!=large)
            {
                secondlarge=arr[i];
            }
            
        }
        System.out.println(secondlarge);
    }
}
