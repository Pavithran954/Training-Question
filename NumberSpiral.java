public class NumberSpiral{
    public static void main(String[] args) {
        int size = 5; 
        int[][] spiral = new int[size][size];
        //String X="x";
        int value = 1;
        int row = 0, col = 0;
        int lastRowIndex = size - 1, lastColIndex = size - 1;

        while (value <= size * size) {

            for (int i = col; i <= lastColIndex; i++) {
                spiral[row][i] = value++;
                //value++;
            }
            row++;


            for (int i = row; i <= lastRowIndex; i++) {
                spiral[i][lastColIndex] =value++;
                //value++;
            }
            lastColIndex--;


            for (int i = lastColIndex; i >= col; i--) {
                spiral[lastRowIndex][i] = value++;
                //value++;
            }
            lastRowIndex--;

            for (int i = lastRowIndex; i >= row; i--) {
                spiral[i][col] = value++;
                //value++;

            }
            col++;
           // if(X=="x"){
           //      X="0";
           //}else{
           //    X="x";
           //}
            
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d",spiral[i][j]);
            }
            System.out.println();
        }
    }
}