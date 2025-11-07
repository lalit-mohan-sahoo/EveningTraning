import java.util.Scanner;

public class Variabledeclartion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the row size");
        int row=sc.nextInt();
        System.out.print("enter the col size");
        int col=sc.nextInt();
        int total=row*col;
        int[][] arr=new int [row][col];
        
        // take input into a matrix
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.printf("enter %d element",total);
                arr[i][j]=sc.nextInt();
                total--;
            }
        }
                for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        
        
    }
}
