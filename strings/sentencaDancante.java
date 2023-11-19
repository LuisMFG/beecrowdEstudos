package strings;

import java.util.Scanner;

public class sentencaDancante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String texto = sc.nextLine();

            boolean letraMaiuscula = true;
            StringBuilder resultado = new StringBuilder();

            for (int i = 0; i < texto.length(); i++) {
                char caractereAtual = texto.charAt(i);

                if (Character.isLetter(caractereAtual)) {
                    resultado.append(letraMaiuscula ? Character.toUpperCase(caractereAtual)
                            : Character.toLowerCase(caractereAtual));
                    letraMaiuscula = !letraMaiuscula;
                } else {
                    resultado.append(caractereAtual);
                }
            }

            System.out.println(resultado.toString());
        }

        sc.close();
    }

}
