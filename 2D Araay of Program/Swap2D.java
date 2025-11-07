public class Swap2D {
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int l=arr.length-1;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
          temp=arr[0][i];
          arr[0][i]=arr[l][i];
          arr[l][i]=temp;
          
          
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][i]+"");
            }
            System.out.println();
        }
        
    }
}
