package strings;

import java.util.Scanner;

public class problemaComACalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String frase = sc.nextLine();

            String a = frase.substring(2, 4);
            String b = frase.substring(5, 8);
            String c = frase.substring(11, 13);

            int resultado = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);
            System.out.println(resultado);
        }

        sc.close();
    }
    
    
}
