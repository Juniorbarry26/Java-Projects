import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option: ");
            scanner.nextLine();
            show_menu();

        }
    }

    static void show_menu(){
        System.out.println("\n Bank Application");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transfer Money");
        System.out.println("5. Check Balance");
        System.out.println("6. Exist");
    }
}
