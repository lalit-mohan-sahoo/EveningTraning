public class Minprofit {
    public static void main(String[] args) {
        int arr[]={5,3,1,6,9,7,8};
        int lenght=arr.length;
        int profit=0;
        int min=arr[0];
        for(int i=1;i<lenght;i++)
        {
            min=Math.min(min,arr[i]);
                profit=Math.max(profit,arr[i]-min);
        }
        System.out.println(profit);
    }
}