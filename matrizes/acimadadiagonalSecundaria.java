package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class acimadadiagonalSecundaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char t = sc.next().toUpperCase().charAt(0);
        double soma = 0.0;
        double[][] m = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++) {
                soma += m[i][j];
            }
        }

        if (t == 'S') {
            System.out.printf("%.1f\n", soma);
        }
        if (t == 'M') {
            System.out.printf("%.1f\n", soma / 66.0);
        }
        sc.close();

    }

}
