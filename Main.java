import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        while (true) {
            show_menu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    create_acc();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                   withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    check_balance();
                    break;
                case 6:
                    System.out.println("Goodbye.... Existing");
                    break;
                default:
                    System.out.println("Invalid choice. Please Try again.");
            }

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

    static void create_acc(){
        System.out.println("Creating an account");
    }
    static void deposit() {
        System.out.println("Depositing an amount");
    }
    static void withdraw(){
        System.out.println("Withdrawing money");
    }
    static void transfer(){
        System.out.println("Transferring money");
    }
    static void check_balance(){
        System.out.println("Checking balance");
    }
}
