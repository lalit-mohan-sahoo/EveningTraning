public class Subarraysum {
    public static void main(String[] args) {
        int result=0;
        int arr[]={1,2,-3,5,6,-4,-5};
        int lenght=arr.length;
        for(int i=0;i<lenght;i++)
        {
            int sum=0;
            for(int j=i;j<lenght;j++)
            {
                sum=sum+arr[j];
                result=Math.max(result,sum);
            }
            
        }
        System.out.println(result);
    }
}
