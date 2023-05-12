import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("OPERAÇÃO DE SOMA");
        System.out.print("Digite o primeiro número: ");
        int number1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.printf("SOMA = %d", sum);
    }
}