import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner dados = new Scanner(System.in);

        double a, r, pi = 3.14159;
        int y = 2;

        r = dados.nextDouble();

        r = Math.pow(r, y);
        a = r * pi;

        System.out.printf("A= %.4f%n", a);

        dados.close();

    }
}