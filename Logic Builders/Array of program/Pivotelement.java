public class Pivotelement {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int pivot=-1;
        int lenght=arr.length;
        for(int i=lenght-2;i>=0;i--)
        {
            if (arr[i]<arr[i+1]) {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
          int start=0;
        int end=lenght-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[start]=temp;
            start++;
            end--;
        }  
        }else{

        
        System.out.println("pivot index is:"+pivot);
        for(int i=lenght-1;i>=pivot;i--)
        {
            if (arr[i]>arr[pivot]) {
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        //reverse
        int start=pivot+1;
        int end=lenght-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<lenght;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
    for(int i=0;i<lenght;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
}
