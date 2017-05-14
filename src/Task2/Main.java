package Task2;

public class Main {
    public static void main(String[] args) {
        Matrix matrixOper = new Matrix();
        System.out.println("MatrixA:");
        matrixOper.matrixCreationInt();
        if (matrixOper.identityMatrix())
            System.out.println("This is identity matrix");
        else
            System.out.println("This is not identity matrix");
        System.out.println();
        System.out.println("MatrixB:");
        matrixOper.matrixCreationDouble();
        System.out.println("MatrixA plus MatrixB:");
        matrixOper.matrixPlus();
        System.out.println();
        System.out.println("MatrixA minus MatrixB:");
        matrixOper.matrixMinus();
        System.out.println();
        matrixOper.matrixMultNumber(5);
        System.out.println();
        System.out.println("MatrixA multiplied by MatrixB:");
        matrixOper.matrixMultMatrix();
        //System.out.println("D=3AB+(A-B)A" + matrixOper.formula());
    }
}