import java.util.Scanner;

class AMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0; 
        int choice;

        System.out.println("Account Management System");

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for using our Banking System!");
                break;
            }

            if (choice == 1) {
                System.out.println("Current Balance: Rs. " + balance);
            } else if (choice == 2) {
                System.out.print("Enter Deposit Amount: ");
                double amount = scanner.nextDouble();
                balance += amount;
                System.out.println("Success! Rs. " + amount + " deposited.");
            } else if (choice == 3) {
                System.out.print("Enter Withdrawal Amount: ");
                double amount = scanner.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Success! Rs. " + amount + " withdrawn.");
                } else {
                    System.out.println("Error: Insufficient Balance!");
                }
            } else {
                System.out.println("Invalid option! Select between 1 and 4.");
            }
        }
        
    }
}
