import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
 
        Bank bank = new Bank();
        Costumer costumer = new Costumer();
        
        //add costumer
        System.out.print("Costumer name: ");
        String client = input.nextLine();
        costumer.setName(client);
        System.out.println("New Costumer included!");

        //add checking
        Accounts check = new Checking(costumer);
        bank.openAccount(check);
        System.out.println("New Checking Account included");
    
        //get number account
        System.out.println("Checking account number: " + check.getNumber());

        //add savings
        Accounts savs = new Savings(costumer);
        bank.openAccount(savs);
        System.out.println("New Savings Account included");
            
        //get number account
        System.out.println("Savings account number: " + savs.getNumber());
        
        //deposits
        System.out.print("Request a Deposit $: ");
        double deposit = input.nextDouble();
        check.depositAmount(deposit);
        System.out.println("$: " + deposit + " added in checking account");

        //transfer
        System.out.print("Amount do transfer to savings account $: ");
        double valueTransfer = input.nextDouble();
        check.transferAmount(valueTransfer, savs);
        System.out.println("Transfer request succesfully processed");

        //savings statement
        savs.printStatement();

        //withdraws
        System.out.print("Request a withdrawal $: ");
        double withdraw = input.nextDouble();
        check.withdrawAmount(withdraw);
        System.out.println("$: " + withdraw + " withdraw sucessfully processed in checking account");
        
        //general report
        bank.printReport();


        input.close();
    } 

    // get menu for future loop option    
    public static void displayMenu() {
        System.out.println("Options");
        System.out.println("1 = Open account");
        System.out.println("2 = Deposits");
        System.out.println("3 = Withdraw");
        System.out.println("4 = Statement");
        System.out.println("5 = Branch Account Report");
        System.out.println("6 = Exit");
        System.out.print("Your choice: ");
    }
}
