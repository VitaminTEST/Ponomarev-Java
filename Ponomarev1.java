import java.util.Scanner;

public class Ponomarev1 {
    private static Scanner scan;

	public static void main(String[] args) {
        
        scan = new Scanner(System.in);{
            System.out.print("Введите 1 число:");
        }int a = scan.nextInt();{
            System.out.print("Введите 2 число:");
        }int b = scan.nextInt();
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}