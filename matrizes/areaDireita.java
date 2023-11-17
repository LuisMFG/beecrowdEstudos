package matrizes;

import java.util.Scanner;

public class areaDireita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagem = 0;
        double soma = 0;
        char operacao;

        operacao = sc.next().charAt(0);

        double[][] matriz = new double[12][12];

        for (int coluna = 0; coluna < 12; coluna++) {
            for (int linha = 0; linha < 12; linha++) {
                matriz[coluna][linha] = sc.nextDouble();

                boolean direita = linha > coluna && linha > (matriz.length - coluna - 1);

                if (direita) {
                    soma += matriz[coluna][linha];
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
