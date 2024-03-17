
import java.util.Scanner;

public class Ponomarev2 {
    
	private static Scanner scan;

	public static void main(String[] args) {
        
		scan = new Scanner(System.in); {
            System.out.print("Введите строку А:");
        }
        String a = scan.nextLine(); {
            System.out.print("Введите строку B:");
        }
        String b = scan.nextLine();
        
        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } 
        else {
            System.out.println("Строки неидентичны");
        }
    }
}