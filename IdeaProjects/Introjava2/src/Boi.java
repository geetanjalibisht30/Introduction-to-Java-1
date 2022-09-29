//import javax.naming.InsufficientResourcesException;
import javax.naming.InsufficientResourcesException;
import  java.util.*;
import  java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Boi implements Bank {
    private int account_number;
    private float rate;
    private float amount;
    private String firstName;
    private String lastName;

    public Bank.account_type acc;
    public int getAccount_number(){
        return account_number;
    }
    public void setAccount_number(int account_number){
        this.account_number= account_number;
    }
    public float getRate (){
        return rate;
    }
    public float getAmount(){
        return  amount;
    }
    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public void setRate (float rate){
        this.rate = rate;
    }
    public void  setAmount (float amount){
        this.amount =amount;
    }
    public  void setFirstName(String firstName){
        this.firstName =firstName;
    }
    public void setLastName( String lastName){
        this.lastName = lastName;
    }

    @Override
    public void getDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter account number: ");
        setAccount_number(obj.nextInt());
        obj.nextLine();
        System.out.println("Enter First Name :");
        setFirstName(obj.nextLine());
        System.out.println("Enter Last Name : ");
        setLastName(obj.nextLine());

        System.out.println("Enter Amount  :");
        setAmount(obj.nextFloat());

        System.out.println("Enter Interest Rate :");
        setRate(obj.nextFloat());

        System.out.println("Press 1 : CURRENT A/C \N Press 2 : SAVING A/C");
        int ch = obj.nextInt();
        if(ch == 1){
            acc = account_type.CURRENT;
        }  System.out.println("Account Number : " + getAccount_number());
        System.out.println(" First Name :" + getFirstName());
        System.out.println("Last Name :"+ getLastName());
        System.out.println("Amount  :" + getAmount());
        System.out.println("Rate   :" + getRate());
        System.out.println("Amount type   :" +  acc);
        else {
            acc = account_type.SAVING;
        }

    }

    @Override
    public void printDetails() {
        System.out.println("Account Number : " + getAccount_number());
        System.out.println(" First Name :" + getFirstName());
        System.out.println("Last Name :"+ getLastName());
        System.out.println("Amount  :" + getAmount());
        System.out.println("Rate   :" + getRate());
        System.out.println("Amount type   :" +  acc);
        }

    @Override
    public void transfer_money() throws InsufficientAmountException {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Amount to Transfer :");
        float amt = obj.nextFloat();

        if(getAmount() < amt){
            String t = "Transaction Ststus : Error ; Reason : Insufficient Balance ";
            write_log(amt,t);
            throw new InsufficientAmountException(" You dont have enough amount :");

        }
        else {
            String t ="Transaction status : Done ";
            setAmount(getAccount_number()-amt);
            write_log(amt,t);
        }
    }

    @Override
    public void write_log(float amt, String trans) {
    try {
        FileWriter myWriter =  new FileWriter("boi_log.txt");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String s = "Date : " +dtf.format(now)+ "; Account number :" + getAccount_number()+ "; Amount withdraw : " + amt +
                "; Amount befor withdraw :" +getAmount()+ "; " + trans;
        myWriter.write(s);
        myWriter.close();

    }
    catch (IOException e){
        System.out.println("An error occurred. ");
        e.printStackTrace();
    }
    }
    public static void main (String[] args ){
        Boi obj = new Boi ();
        obj.getDetails();
        obj.printDetails();
        try {
            obj.transfer_money();
        }
        catch (InsufficientResourcesException e){
            System.out.println(e);
        }
    }
}
