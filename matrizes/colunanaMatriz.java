package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class colunanaMatriz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double soma = 0;
        int c = sc.nextInt();
        char t = sc.next().toUpperCase().charAt(0);

        double[][] m = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < m.length; j++) {
            soma += m[j][c];
        }

        if (t == 'M') {
            soma /= m.length;
        }

        System.out.println(String.format("%.1f", soma));

        sc.close();

    }

}
