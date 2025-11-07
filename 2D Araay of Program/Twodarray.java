public class Twodarray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,5},{6,7,8}};
        int lenght=arr.length;
        for(int i=0;i<lenght;i++)
        {
            for(int j=0;j<lenght;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
