package strings;

import java.util.Scanner;

public class led {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < N; i++) {
            String valorStr = sc.nextLine();
            int totalLedsCalculados = 0;

            int[] ledsPorNumero = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

            for (char d : valorStr.toCharArray()) {
                int ledsDoNumero = ledsPorNumero[Character.getNumericValue(d)];
                totalLedsCalculados += ledsDoNumero;
            }

            System.out.println(totalLedsCalculados + " leds");
        }

        sc.close();
    }
}
