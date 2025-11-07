public class Display1strowandlastrow {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{6,7,8}};
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if (i==0 || i==arr.length-1) {
                    System.out.print(" "+arr[i][j]);
                
                }else{
                    System.out.print(" x"+"");
                }
                
            }
            System.out.println( );
        }
    }
}
