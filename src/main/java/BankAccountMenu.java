import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        boolean running = true;
        double bankAccount = 0.0;
        Scanner sc = new Scanner(System.in);
        
        while(running) {
            int choice;
            System.out.println("------------Bank Account-------------");
            System.out.println("Option 1. Add money");
            System.out.println("Option 2. Withdraw money");
            System.out.println("Option 3. Check balance");
            System.out.println("Option 4. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Whats your choice?");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("What amount do you want to add?");
                    double adding = sc.nextDouble();
                    if(adding < 0)
                    {
                        System.out.println("No negative values");
                    } else {
                        bankAccount += adding;
                        System.out.println("Result: " + bankAccount);
                    }
                    break;
                case 2:
                    System.out.println("What amount are you withdrawing?");
                    double subtract = sc.nextDouble();
                    if (subtract < 0) {
                        System.out.println("No negative values");
                    } else if (subtract > bankAccount) {
                        System.out.println("Insufficient funds");
                    } else {
                        bankAccount -= subtract;
                        System.out.println("Result: " + bankAccount);
                    }
                    break;
                case 3: 
                    System.out.println("You have " + bankAccount + " dollars.");
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;
            }
        }
    }
}
