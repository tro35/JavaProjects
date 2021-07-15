public class MatrixTranspose {
    public static void main(String[] args) {
        int [][] mat = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int [][] matOut = new int[3][3];

        int [][] mat1 = {{5, 9, 3, 7},
                         {3, 2, 1, 8}};

        int[][] matOut1 = new int[4][2];

        matrixPrinter(matrixTranspose(mat,matOut));
        matrixPrinter(matrixTranspose(mat1,matOut1));


    }

    /*public static void matrixTranspose(int [][] inputMat, int [][]outputMat){

        for (int i = 0; i < outputMat.length; i++) {
            for (int j = 0; j < inputMat.length; j++) {
                outputMat[i][j] = inputMat[j][i];
                System.out.print(outputMat[i][j] + ",");
            }
            System.out.println();
        }

    }*/

    public static int [][] matrixTranspose(int [][] inputMat, int [][]outputMat){

        for (int i = 0; i < outputMat.length; i++) {
            for (int j = 0; j < inputMat.length; j++) {
                outputMat[i][j] = inputMat[j][i];
                //System.out.print(outputMat[i][j] + ",");
            }
            //System.out.println();
        }
        return outputMat;
    }

    public static void matrixPrinter (int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}
