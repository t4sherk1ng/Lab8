import java.util.Scanner;

public class Bank {

    public static BankAccount[] accounts = new BankAccount[100];

    public static int bankCount = 0;


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("create")) {
                create();
            } else if (command.matches("^Set Interest (\\d+)$")) {
                setInterest(Integer.parseInt(command.split(" ")[2]));
            } else if (command.matches("^Add Deposit (\\d+) (\\d+)$")) {
                addDeposit(Integer.parseInt(command.split(" ")[2]), Integer.parseInt(command.split(" ")[3]));
            } else if (command.matches("^Get Interest (\\d+) (\\d+)$")) {
                getInterest(Integer.parseInt(command.split(" ")[2]), Integer.parseInt(command.split(" ")[3]));
            } else if (command.equalsIgnoreCase("end")) {
                return;
            } else {
                System.out.println("Wrong command. Try again");
            }
        }
    }

    public static void create() {
        accounts[bankCount] = new BankAccount();
        bankCount++;
        System.out.println("Account ID" + bankCount + " created");
    }

    public static void setInterest(int interest) {
        BankAccount.setInterestRate(interest);
        System.out.println("Change Interest Rate");
    }

    public static void addDeposit(int id, int amount) {
        try {
            if (accounts[id-1] != null) {
                accounts[id-1].deposit(amount);
                System.out.println("Deposited " + amount + " to ID" + id);
            } else {
                System.out.println("Account does not exist");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Account does not exist");
        }
    }

    public static void getInterest(int id, int years) {
        try {
            if (accounts[id-1] != null) {
                System.out.println(accounts[id-1].getInterest(years));
            } else {
                System.out.println("Account does not exist");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Account does not exist");
        }
    }

}
