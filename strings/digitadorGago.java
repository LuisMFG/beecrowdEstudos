package strings;

import java.util.Scanner;

public class digitadorGago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();
        StringBuilder textoCorreto = new StringBuilder(texto);

        for (int i = 0; i < textoCorreto.length() - 4; i++) {
            if (textoCorreto.charAt(i) == ' ' &&
                    textoCorreto.charAt(i + 1) == textoCorreto.charAt(i + 3) &&
                    textoCorreto.charAt(i + 2) == textoCorreto.charAt(i + 4)) {
                textoCorreto.deleteCharAt(i + 3);
                textoCorreto.deleteCharAt(i + 2);
            }
        }

        System.out.println(textoCorreto);

        sc.close();
    }

}
