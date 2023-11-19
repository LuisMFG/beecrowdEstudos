package strings;

import java.util.Scanner;

public class comparacaodeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String frase1 = sc.nextLine();
            String frase2 = sc.nextLine();
            int tamanhoLimite = 0;
            int[][] m = new int[frase1.length() + 1][frase2.length() + 1];

            for (int l = 1; l <= frase1.length(); l++) {
                for (int c = 1; c <= frase2.length(); c++) {
                    if (frase1.charAt(l - 1) == frase2.charAt(c - 1)) {
                        m[l][c] = m[l - 1][c - 1] + 1;
                        tamanhoLimite = Math.max(tamanhoLimite, m[l][c]);
                    } else {
                        m[l][c] = 0;
                    }
                }
            }

            System.out.println(tamanhoLimite);
        }

        sc.close();
    }

}
