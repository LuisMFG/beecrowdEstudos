package strings;

import java.util.Scanner;

public class zerovaleZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            } else {
                int soma = a + b;
                int semZeros = 0;
                int multiplicador = 1;

                while (soma > 0) {
                    int numero = soma % 10;

                    if (numero != 0) {
                        semZeros += numero * multiplicador;
                        multiplicador *= 10;
                    }

                    soma /= 10;
                }

                System.out.println(semZeros);
            }
        }

        sc.close();
    }

}
