package matrizes;

import java.io.IOException;
import java.util.Scanner;

public class matrizQuadrada1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (true) {
            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            int[][] matriz = new int[N][N];

            for (int linha = 0; linha < N; linha++) {
                for (int coluna = 0; coluna < N; coluna++) {
                    int valor = Math.min(Math.min(linha, coluna),
                            Math.min(N - linha - 1, N - coluna - 1)) + 1;
                    matriz[linha][coluna] = valor;
                }
            }

            for (int linha = 0; linha < N; linha++) {
                for (int coluna = 0; coluna < N; coluna++) {
                    output.append(String.format("%3d", matriz[linha][coluna]));
                    if (coluna < N - 1) {
                        output.append(" ");
                    }
                }
                output.append("\n");
            }

            output.append("\n");
        }

        System.out.print(output.toString());
        sc.close();
    }

}
