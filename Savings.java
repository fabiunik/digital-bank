public class Savings extends Accounts {
    
    
   public Savings(Costumer costumer){
        super(costumer);
    }
    
    @Override
    public void getStatement() {
        System.out.println("-----Savings Statement----");
        super.printStatement();
    }
}
