import java.util.Scanner;

public class 输入输出 {
    //拿取m
    Scanner scanner = new Scanner(System.in);
    int m=scanner.nextInt();




    //数组
    int[][] read_Array(int row, int col, Scanner scanner){
        int[][] p=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                p[i][j]=scanner.nextInt();
            }
        }
        return p;
    }
    //char数组
    char[][] read_char_Array(int row, int col, Scanner scanner){
        char[][] c=new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=scanner.next().charAt(0);
            }
        }
        return c;
    }

}

