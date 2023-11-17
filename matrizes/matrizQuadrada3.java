package matrizes;

import java.util.Scanner;

public class matrizQuadrada3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoCampo;
        int N;
        while ((N = sc.nextInt()) != 0) {
            int[][] matriz = new int[N][N];

            for (int linha = 0; linha < N; linha++) {
                for (int coluna = 0; coluna < N; coluna++) {
                    matriz[linha][coluna] = (int) Math.pow(2, linha + coluna);
                }
            }

            int maiorElemento = matriz[N - 1][N - 1];
            tamanhoCampo = String.valueOf(maiorElemento).length();

            for (int linha = 0; linha < N; linha++) {
                for (int coluna = 0; coluna < N; coluna++) {
                    System.out.printf("%" + tamanhoCampo + "d", matriz[linha][coluna]);

                    if (coluna < N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }

}
