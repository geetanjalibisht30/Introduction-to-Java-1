import javax.naming.InsufficientResourcesException;

public interface Bank {
    void  getDetails();
    void printDetails();
    void transfer_money() throws InsufficientAmountException ;
    void write_log(float amt, String trans);
    enum account_type{
        CURRENT,
        SAVING
    }

    class InsufficientAmountException extends Exception {
        public InsufficientAmountException(String s){

        }
    }
}
