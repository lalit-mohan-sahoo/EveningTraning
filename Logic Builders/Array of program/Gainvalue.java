public class Gainvalue {
    public static void main(String[] args) {
        int arr[]={5,3,1,6,9,7,8};
        int lenght=arr.length;
        int profit=0;
        for(int i=0;i<lenght-1;i++)
        {
            for(int j=i+1;j<lenght;j++)
            {
                profit=Math.max(profit,arr[j]-arr[i]);             
            }
        }
        System.out.println(profit);
    }
}
