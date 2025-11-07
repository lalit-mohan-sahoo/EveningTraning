public class Swapcol {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{6,7,8}};
        int lastcol=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i][lastcol];
            arr[i][lastcol]=arr[i][0];
            arr[i][0]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
    }
}
