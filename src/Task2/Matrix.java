package Task2;

class Matrix {
    //public static void main(String[] args)
    int matrixA[][] = {{1, 2, 2}, {0, 3, 1}, {1, 0, 0}};
    double matrixB[][] = {{0D, 0D, 1D}, {-1 / 4D, 1 / 2D, 1 / 4D}, {3 / 4D, -1 / 2D, -7 / 10D}};
    boolean check = false;


    public void matrixCreationInt() {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void matrixCreationDouble() {
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                System.out.print(matrixB[i][j] + ";  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean identityMatrix() {
        Mark:
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (i == j) {
                    if (matrixA[i][j] == 1) {
                        check = true;
                    } else {
                        check = false;
                        break Mark;
                    }
                } else {
                    if (matrixA[i][j] == 0) {
                        check = true;
                    } else {
                        check = false;
                        break Mark;
                    }
                }
            }
        }
        return check;
    }

    public double[][] matrixPlus() {
        double matrixPlus[][] = new double[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixPlus.length; i++) {
            for (int j = 0; j < matrixPlus[i].length; j++) {
                matrixPlus[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixPlus[i][j] + ";  ");
            }
            System.out.println();
        }
        return matrixPlus;
    }

    public double[][] matrixMinus() {
        double matrixMinus[][] = new double[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixMinus.length; i++) {
            for (int j = 0; j < matrixMinus[i].length; j++) {
                matrixMinus[i][j] = matrixA[i][j] - matrixB[i][j];
                System.out.print(matrixMinus[i][j] + ";  ");
            }
            System.out.println();
        }
        return matrixMinus;
    }

    public double[][] matrixMultNumber(int Number) {
        System.out.println("MatrixA is multiplied by " + Number);
        double matrixMultNumber[][] = new double[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixMultNumber.length; i++) {
            for (int j = 0; j < matrixMultNumber[i].length; j++) {
                matrixMultNumber[i][j] = matrixA[i][j] * Number;
                System.out.print(matrixMultNumber[i][j] + ";  ");
            }
            System.out.println();
        }
        return matrixMultNumber;
    }

    public double[][] matrixMultMatrix() {
        double matrixMultMatrix[][] = new double[3][3];
        for (int i = 0; i < matrixMultMatrix.length; i++) {
            for (int j = 0; j < matrixMultMatrix[i].length; j++) {
                for (int k = 0; k < matrixMultMatrix.length; k++) {
                    matrixMultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(matrixMultMatrix[i][j] + ";  ");
            }
            System.out.println();
        }
        return matrixMultMatrix;
    }

    public double[][] matrixMultMatrix(int Number) {
        double matrixMultMatrix[][] = new double[3][3];
        for (int i = 0; i < matrixMultMatrix.length; i++) {
            for (int j = 0; j < matrixMultMatrix[i].length; j++) {
                for (int k = 0; k < matrixMultMatrix.length; k++) {
                    matrixMultMatrix[i][j] += matrixA[i][k] * matrixB[k][j] * Number;
                }
                System.out.print(matrixMultMatrix[i][j] + ";  ");
            }
            System.out.println();
        }
        return matrixMultMatrix;
    }

//    public double formula() {
//
//    }
}