import java.util.Locale;

public class hellowworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int y = 32;
        System.out.println(y);

        double x = 10.1203129323;
        System.out.printf("%.2f%n", x);
        System.out.println("Result = " + x + " Subways");
        System.out.printf("Result =  %.2f Subways%n", x);
        Locale.setDefault((Locale.US));

        String name = "Douglas";
        int age = 18;
        double income = 750.5;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, income);

    }
}