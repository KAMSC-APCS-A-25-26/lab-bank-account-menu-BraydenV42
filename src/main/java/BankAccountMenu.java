import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        boolean running = true;
        double bankAccount = 0.00;
        Scanner sc = new Scanner(System.in);
        
        while(running) {
            int choice;
            System.out.println("\n ------------Bank Account-------------");
            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter amount to add: ");
                    double adding = sc.nextDouble();
                    if(adding < 0)
                    {
                        System.out.println("No negative values");
                    } else {
                        bankAccount += adding;
                        System.out.println("Added $" + adding);
                        System.out.println("New Balance: $" + bankAccount);
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double subtract = sc.nextDouble();
                    if (subtract < 0) {
                        System.out.println("No negative values");
                    } else if (subtract >= bankAccount) {
                        System.out.println("Insufficient funds");
                    } else {
                        bankAccount -= subtract;
                        System.out.println("Withdrew $" + subtract")
                        System.out.print("New Balance: $" + bankAccount);
                    }
                    break;
                case 3: 
                    System.out.print("Current Balance: $" + bankAccount);
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}
