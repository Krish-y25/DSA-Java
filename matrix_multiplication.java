public class matrix_multiplication {
    static void m_mult(int[][] m1, int[][] m2){
        int n = m1.length;
        int[][] res = new int[n][n];
        for (int i =0; i<n; i++){
            for (int j =0; j<n; j++){
                res[i][j] = 0;
                for (int k = 0; k<n; k++){
                    res[i][j] = res[i][j] + m1[i][k]*m2[k][j];
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j =0; j<n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] mat1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] mat2 = {{1,4,7}, {2,5,8}, {3,6,9}};
        m_mult(mat1, mat2);
    }
}
