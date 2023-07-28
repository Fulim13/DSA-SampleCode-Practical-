package matrix;

public interface SquareMatrixInterface {

    void makeEmpty(int m);

    void storeValue(int i, int j, int value);

    SquareMatrixInterface add(SquareMatrixInterface m);

    void copy(SquareMatrixInterface m2);
}
