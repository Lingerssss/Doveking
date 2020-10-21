import java.util.Scanner;

public class YoungTableau {
    public static int max = Integer.MAX_VALUE;
    static int[][] youngTableauArr;
    public static int sortMin=Integer.MIN_VALUE;

    public static void insertKey(int[][] youngTableauArr, int maxRow, int maxColumn, int key) {
        int insertRow = maxRow;
        int insertColumn = maxColumn;
        int temp;
        max = youngTableauArr[maxRow][maxColumn];
        if(youngTableauArr[maxRow][maxColumn] < key) {
            System.out.println("No more insertion possible or Tableau is full");
            return;
        }
        youngTableauArr[maxRow][maxColumn] = key;
        while((maxRow>0 || maxColumn >0) && (max >youngTableauArr[maxRow][maxColumn] )) {
            temp=youngTableauArr[maxRow][maxColumn] ;
            youngTableauArr[maxRow][maxColumn] =youngTableauArr[insertRow][insertColumn];
            youngTableauArr[insertRow][insertColumn] =temp;
            maxRow= insertRow;
            maxColumn = insertColumn;
            if (maxRow - 1 >= 0 && youngTableauArr[maxRow][maxColumn] < youngTableauArr[maxRow-1][maxColumn]){
                insertRow = maxRow -1;
                insertColumn= maxColumn;
            }
            if(maxColumn -1 >= 0 && youngTableauArr[insertRow][insertColumn] < youngTableauArr[maxRow][maxColumn-1]){
                insertRow = maxRow;
                insertColumn = maxColumn - 1;
            }
            max = youngTableauArr[insertRow][insertColumn];
        }
    }

    public static int extractMin(int[][] youngTableauArr, int maxRow, int maxColumn) {
        int min = youngTableauArr[0][0];
        youngTableauArr[0][0]= Integer.MAX_VALUE;
        youngify(youngTableauArr, 0, 0, maxRow, maxColumn);
        return min;
    }

    public static void youngify(int [][] youngTableauArr,int row, int column, int maxRow, int maxColumn) {
        int newRow = row , newColumn = column, temp;
        if (row + 1 <= maxRow){
            if (youngTableauArr[row][column] > youngTableauArr[row+1][column]){
                newRow = row + 1;
                newColumn = column;
            }
        }
        if (column+1 <= maxColumn){
            if (youngTableauArr[newRow][newColumn] > youngTableauArr[row][column+1]){
                newRow = row;
                newColumn = column+1;
            }
        }
        if(newRow != row || newColumn != column){
            temp = youngTableauArr[newRow][newColumn];
            youngTableauArr[newRow][newColumn] =youngTableauArr[row][column];
            youngTableauArr[row][column] = temp;
            youngify(youngTableauArr, newRow, newColumn, maxRow, maxColumn);
        }
    }

    public static void sortArray(int maxRow, int maxColumn) {
        int [] sortedArray= new int [(maxRow+1)*(maxColumn+1)];
        int i=0;
        while (youngTableauArr[0][0] != Integer.MAX_VALUE) {
            sortedArray[i]= extractMin(youngTableauArr, maxRow, maxColumn);
            i++;
        }
        System.out.println("*********Printing Sorted Aarray *********");
        System.out.print("Sorted array -> [ ");
        for(int j=0; j<i; j++) {
            System.out.print(sortedArray[j]);
            if(j!=i-1)
                System.out.print(", ");
        }
        System.out.print(" ]");
    }

    public static boolean searchKey(int [][]youngTableauArr,
                                    int key, int maxRow,
                                    int maxColumn){
        int row=0;
        int column=maxColumn;
        while(row >= 0 && column <= maxColumn){
            if(row>maxRow || column<0)
                return false;
            if (youngTableauArr[row][column] == key)
                return true;
            if (youngTableauArr[row][column]  > key)
                column--;
            else
                row++;
        }
        return false;
    }

    public static void printYoungTableau(int[][] youngTableauArr, int maxRow, int maxColumn) {
        for (int i = 0; i <= maxRow; i++) {
            System.out.println("\n");
            for (int j = 0; j <= maxColumn; j++) {
                if (youngTableauArr[i][j] == Integer.MAX_VALUE) {
                    System.out.print("\t_\t");
                } else
                    System.out.print("\t" + youngTableauArr[i][j] + "\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        int rows;
        int columns;
        System.out.println("Enter the rows of Young Tableau");
        String inputString = reader.nextLine();
        if (null != inputString && !inputString.equals("")) {
            rows = Integer.parseInt(inputString);
            inputString = "";
        } else {
            System.out.println("Entered value is invalid.");
            reader.close();
            return;
        }
        System.out.println("Enter the columns of Young Tableau");
        inputString = reader.nextLine();
        if (null != inputString && !inputString.equals("")) {
            columns = Integer.parseInt(inputString);
            inputString = "";
        } else {
            System.out.println("Entered value is invalid.");
            reader.close();
            return;
        }
        System.out.println("Enter a comma seperated list for which maximum sequence is to be found: ");
        inputString = reader.nextLine();
        if (null == inputString || ("").equals(inputString)) {
            System.out.println("Only a valid input of signed integers is allowed.");
        } else {
            String[] tokens = inputString.split(",");
            int arr[] = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = new Integer(tokens[i]);
            }

            youngTableauArr = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    youngTableauArr[i][j] = Integer.MAX_VALUE;
                }
            }
            //Inserting elements one by one in the Young Tableau
            for (int i = 0; i < arr.length; i++) {
                insertKey(youngTableauArr, rows-1, columns-1, arr[i]);
            }

            System.out.println("**********Output after Inserting all Elements **************");
            printYoungTableau(youngTableauArr, rows-1, columns-1);
            System.out.println("");

            System.out.println("**********Search Young Tableau**************");
            System.out.println("Enter the key you wish to search.");
            inputString = reader.nextLine();
            int key = Integer.parseInt(inputString);
            boolean keySearched = searchKey(youngTableauArr, key, rows-1, columns-1);
            if(keySearched)
                System.out.println("Key Found!!");
            else
                System.out.println("Key Not Found!!");

            int min = extractMin(youngTableauArr, rows-1, columns-1);
            System.out.println("Minimum element = "+ min);
            System.out.println("**********After Extract Min**************");
            printYoungTableau(youngTableauArr, rows-1, columns-1);
            System.out.println("");

            sortArray(rows-1, columns-1);
            reader.close();
        }
    }
}