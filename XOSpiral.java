public class XOSpiral {
	    public static void main(String[] args) {
	        int size = 9; 
	        String[][] spiral = new String[size][size];
            String X="x";
	        int value = 1;
	        int row = 0, col = 0;
	        int lastRowIndex = size - 1, lastColIndex = size - 1;

	        while (value <= size * size) {

	            for (int i = col; i <= lastColIndex; i++) {
	                spiral[row][i] = X;
	                value++;
	            }
	            row++;


	            for (int i = row; i <= lastRowIndex; i++) {
	                spiral[i][lastColIndex] =X;
	                value++;
	            }
	            lastColIndex--;


	            for (int i = lastColIndex; i >= col; i--) {
	                spiral[lastRowIndex][i] = X;
	                value++;
	            }
	            lastRowIndex--;

	            for (int i = lastRowIndex; i >= row; i--) {
	                spiral[i][col] = X;
	                value++;

	            }
	            col++;
	            if(X=="x"){
	                 X="0";
	           }else{
	               X="x";
	           }
	            
	        }
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.printf(" " +spiral[i][j]);
	            }
	            System.out.println();
	        }
	    }
}