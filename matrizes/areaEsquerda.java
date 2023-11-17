package matrizes;

import java.util.Scanner;

public class areaEsquerda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagem = 0;
        double soma = 0;
        char operacao;

        operacao = sc.next().charAt(0);

        double[][] matriz = new double[12][12];

        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = sc.nextDouble();

                boolean esquerda = coluna < linha && coluna < (matriz.length - linha - 1);

                if (esquerda) {
                    soma += matriz[linha][coluna];
                    contagem++;
                }
            }
        }

        if (operacao == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", (soma / contagem));
        }
        sc.close();
    }

}
