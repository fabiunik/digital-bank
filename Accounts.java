
/**
 * Accounts
 */
public abstract class Accounts implements Transactions{

    private static final int MAIN_BRANCH = 1;

    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double availableBalance;
    protected Costumer costumer;
        
    public Accounts(Costumer costumer) {
        this.branch = Accounts.MAIN_BRANCH;
        this.number = SEQUENTIAL++;
        this.costumer = costumer;
    }
    
    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    protected void printStatement() {
        System.out.format("Costumer: %s", this.costumer.getName());
        System.out.format("\nBranch: %d", this.branch);
        System.out.format("\nAccount Number: %d", this.number);
        System.out.format("\nAvailable Balance: %.2f\n\n", this.availableBalance);
    }

    @Override
    public void depositAmount(double value) {
        availableBalance += value;      
    }

    @Override
        public void withdrawAmount(double value) {
            availableBalance -= value;   
    }
   
    @Override
    public void transferAmount(double value, Accounts beneficiary) {
        this.withdrawAmount(value);
        beneficiary.depositAmount(value);   
    }

    @Override
    public String toString() {
        return "Accounts [Costumer= " + costumer.getName() + " , Account number=" + number + ", Available Balance=" + availableBalance +  "]";
    }
}

    