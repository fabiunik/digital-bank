public class Checking extends Accounts {
 
    public Checking(Costumer costumer){
        super(costumer);        
    }
    
    @Override
    public void getStatement() {
        System.out.println("-----Checking Statement----");
        super.printStatement();
    }
    
}
