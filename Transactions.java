public interface Transactions {
    
    public void depositAmount(double value);

    public void withdrawAmount(double value); 

    public void transferAmount(double value, Accounts beneficiary);
    
    public void getStatement();

    
}
