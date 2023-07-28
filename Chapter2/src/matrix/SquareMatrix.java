package matrix;

public class SquareMatrix implements SquareMatrixInterface {
    private int n;
    private int[][] array;

    public SquareMatrix(int n) {
        this.n = n;
        this.array = new int[n][n];
    }
    
    

    @Override
    public void makeEmpty(int m) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (int i = 0; i < m; i++) {
            
        }
    }

    @Override
    public void storeValue(int i, int j, int value) {
        this.array[i-1][j-1] = value;
    }
        

    @Override
    public SquareMatrixInterface add(SquareMatrixInterface m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void copy(SquareMatrixInterface m2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "SquareMatrix{" + '}';
    }
    
    

}
