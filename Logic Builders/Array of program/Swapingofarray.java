public class Swapingofarray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int lenght=arr.length;
        int left=0;
        int right=lenght-1;
        int temp;
        while (left<right) {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<lenght;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
