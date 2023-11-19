package strings;

import java.util.Scanner;

public class combinador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] casoTeste = sc.nextLine().split(" ");
            char[] c1 = casoTeste[0].toCharArray();
            char[] c2 = casoTeste[1].toCharArray();
            StringBuilder resultado = new StringBuilder();

            for (int v = 0; v < (c1.length + c2.length); v++) {
                if (v < c1.length) {
                    resultado.append(c1[v]);
                }
                if (v < c2.length) {
                    resultado.append(c2[v]);
                }
            }
            System.out.println(resultado.toString());
        }

        sc.close();
    }

}
