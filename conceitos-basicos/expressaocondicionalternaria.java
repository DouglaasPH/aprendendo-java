import java.util.Scanner;

public class expressaocondicionalternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco;

        System.out.println(desconto);
        sc.close();
    }
}
