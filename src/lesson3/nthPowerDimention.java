package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nthPowerDimention {

    public static double[][] multSqMatrices(double[][] b, double[][] a) {
        int dim = b.length;
        double[][] c = new double[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                for (int k = 0; k < dim; k++) {
                    c[i][j] = c[i][j] + b[i][k] * a[k][j];
                }
            }
        }

        return c;
    }

    public static void showMatrix(double [][] c){
        int nRows = c.length;
        int nCols = c[0].length;
        for(int i=0;i<nRows;i++)
            for(int j=0;j<nCols;j++)
                System.out.print(c[i][j]+"\t");
        System.out.println();
    }

    public static void main(String[] args) {
        double[][] a, b, c;
        int dim, n;

        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter matrix size:");
        try {
            dim = Integer.parseInt(stdin.readLine());

            a = new double[dim][dim];
            b = new double[dim][dim];
            c = new double[dim][dim];

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    System.out.print("a" + (i + 1) + (j + 1) + "=");
                    a[i][j] = Double.parseDouble(stdin.readLine());
                }
            }

            System.out.print("Enter n:");
            n = Integer.parseInt(stdin.readLine());

            b = a;

            for (int k = 1; k < n; k++) {
                c = multSqMatrices(b, a);
                b = c;
            }

            showMatrix(c);

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
