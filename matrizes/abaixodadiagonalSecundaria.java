package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class abaixodadiagonalSecundaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char t = sc.next().toUpperCase().charAt(0);
        double soma = 0.0;
        double[][] m = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j > m.length - i - 1) {
                    soma += m[i][j];
                }
            }
        }

        if (t == 'M') {
            soma /= (Math.pow(m.length, 2) - 12) / 2;

        }

        System.out.printf("%.1f\n", soma);

        sc.close();

    }

}
