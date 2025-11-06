public class Largestnumarry {
    public static void main(String[] args) {
        int arr[]={10,20,30,60,50};
        int large=arr[0];
        int lenght=arr.length;
        for(int i=1;i<lenght;i++)
        {
            if (large<arr[i]) {
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
