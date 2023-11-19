package strings;

import java.util.Scanner;

public class sobrenomeNaoEhFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            boolean dificil = false;

            for (int l = 0; l < s.length() - 2; l++) {
                if (!("aeiouAEIOU".indexOf(s.charAt(l)) != -1) &&
                        !("aeiouAEIOU".indexOf(s.charAt(l + 1)) != -1) &&
                        !("aeiouAEIOU".indexOf(s.charAt(l + 2)) != -1)) {
                    dificil = true;
                    break;
                }
            }

            if (!dificil) {
                System.out.println(s + " eh facil");
            } else {
                System.out.println(s + " nao eh facil");
            }
        }

        sc.close();
    }

}
