import java.util.Scanner;

public class DiagonalsAnti {
    public static void antyDig(int[][] array,int row,int col)
    {
        for(int x=0;x<col;x++)
        {
            int i=0,j=x;
            while(i<row && j>=0)
            {
                System.out.println(array[i][j]);
                i++;
                j--;
            }
            for(int k=col-1;k>x;k--){
                System.out.print(0+" ");
            }
            System.out.println();
        }
        for(int y=0;y<row;y++)
        {
            int i=y,j=col-1;
            while(i<row && j>=0)
            {
                System.out.println(array[i][j]);
                i++;
                j--;
            }
            for(int k=y;k>col-1;k++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]= scanner.nextInt();
            }
        }
        antyDig(array,row,col);
    }
}
