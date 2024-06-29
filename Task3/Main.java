import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ATM atm = new ATM ();

        System.out.println("\t \"Welcom to the ATM program\"");
        System.out.println("Choose from the following options:");
        System.out.println(" (1)Withdrawing\n (2)Depositing\n (3)Checking the balance");
        int option = s.nextInt();

        if(option == 1) {
            System.out.print("Enter the withdraw amount:");
            float amount = s.nextFloat();
            atm.withdraw(amount);
        }
        else if(option == 2) {
            System.out.print("Enter the deposit amount:");
            float amount = s.nextFloat();
            atm.deposit(amount);
        }
        else if(option == 3) {
            atm.checkBalance();
        }
        else{
            System.out.println("ERROR!!\nWRONG CHOICE, PLEASE CHOOSE AGAIN...");
        }


    }
}