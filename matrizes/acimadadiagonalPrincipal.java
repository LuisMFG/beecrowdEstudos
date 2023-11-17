package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class acimadadiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int media = 0;
        char t = sc.next().toUpperCase().charAt(0);
        double soma = 0.0;
        double[][] m = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j > i) {
                    soma += m[i][j];
                    media++;
                }
            }
        }

        if (t == 'S') {
            System.out.printf("%.1f\n", soma);
        }
        if (t == 'M') {
            System.out.printf("%.1f\n", soma / media);
        }
        sc.close();
    }

}
