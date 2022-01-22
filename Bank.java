import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Accounts> accounts;

    public Bank(){
        this.accounts = new ArrayList<Accounts>();
        this.name = "Million Bank";
    }

    public void openAccount(Accounts acc) {
        accounts.add(acc);        
    }

    /*public void getAccountNumber() {}*/
        
    public void printReport() {  
        System.out.println("---------------------------Million Bank----------------------------");
        System.out.println("------------------------------Branch 1-----------------------------");
        System.out.println("---------------------General Report Accounts-----------------------");
        
        for (Accounts acc : accounts) {
            System.out.println(acc);
            System.out.println("--------------------------------------------------------------------"); 
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Accounts> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
    
}
