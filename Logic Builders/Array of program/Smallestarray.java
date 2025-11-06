public class Smallestarray {
    public static void main(String[] args) {
        int arr[]={10,20,5,40};
        int small=arr[0];
        int lenght=arr.length;
        for(int i=1;i<lenght;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
