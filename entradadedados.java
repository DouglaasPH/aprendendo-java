
import java.util.Locale;
import java.util.Scanner;

public class entradadedados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        int y;
        String w;
        x = sc.nextDouble();
        sc.nextLine();
        y = sc.nextInt();
        sc.nextLine();
        w = sc.nextLine();
        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);
        System.out.println("Você digitou: " + w);

        sc.close();
    }
};
