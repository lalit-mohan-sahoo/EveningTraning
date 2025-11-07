public class Printalldigonalelement {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==j)
                {
                    System.out.print(" "+arr[i][j]);
                }else{
                    System.out.print(" x"+"");
                }
                
            }
            System.out.println();
        }
    }
}
