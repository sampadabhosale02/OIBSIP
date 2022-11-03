import java.util.*;

import javax.lang.model.util.ElementScanner6;
import javax.net.ssl.X509ExtendedKeyManager;

class ATM {

    private char username;
    private int pin;
    private float amount;
    private float balance,total;

    Scanner sc = new Scanner(System.in);

    ATM(){

        balance = 0.0f;
    }

    void accept(){
        int ch;
        
        System.out.println("Enter valid username");
       
        username = sc.next().charAt(0);
        System.out.println("Enter correct pin");
        pin = sc.nextInt();
        System.out.println("--------------------");
        System.out.println("Successful Login !!");
        System.out.println("--------------------");
        
        
        
            while(true){
                System.out.println(" ");   
                System.out.println("----------------------------------");
                System.out.println("Select operations to be performed");
                System.out.println("1.Withdraw Cash");
                System.out.println("2.Deposit Cash");
                System.out.println("3.Check Balance");
                System.out.println("4.Transfer");
                System.out.println("6.Quit");
                System.out.println("----------------------------------");
                System.out.println("Enter your choice");
                ch = sc.nextInt();

                switch ((ch)) {
                    case 1:
                        withdraw_cash();
                        break;

                    case 2:
                        deposit_cash();
                        break;

                    case 3:
                        check_balance();
                        break;   
                
                    case 4:
                        transfer();
                        break;

                    case 6:
                        quit();
                        break;
                }
            }

            
        
    }

    

    void check_balance(float x){

        balance = total;
        System.out.println("Toatl balance available is " + balance);
    }

    void withdraw_cash(){
        System.out.println("Enter amount to be withdrawn");
        amount = sc.nextFloat();

        if (amount <= balance ){
            System.out.println(amount + " withdrawn successfully");
            total = balance - amount ;
            check_balance();
            
        }
        else{
            System.out.println("OOPSS !! Insufficient balance..");
        }

    }

    void deposit_cash(){
        System.out.println("Enter amount to be deposited");
        amount = sc.nextFloat();
        System.out.println("Rs " + amount + " successfully deposited");
        total = balance + amount ;
        check_balance();
        
    }

    void check_balance(){
        balance = total;
        System.out.println("Your total balance is: "+ balance);
    }

    void transfer(){
        String bank_name , ifsc;
        long acc_no;
        System.out.println("Enter Bank Name");
        bank_name = sc.next();

        System.out.println("Enter IFSC");
        ifsc = sc.next();

        System.out.println("Enter account number");
        acc_no = sc.nextLong();

        System.out.println("Enter amount to be transfered");
        amount = sc.nextFloat();

       
        if(amount < balance)
        {
            System.out.println("Amount transfered succefully to "+ acc_no);
            total = balance - amount;
        }
        else{
            System.out.println("Insufficient balance !! Please try with sufficient balance." );
        }
        

        check_balance();


    }

    void quit(){

    	System.exit(0);

    }


}

class Sample{

    public static void main(String args[]) {

        ATM x = new ATM();
        x.accept();
        x.deposit_cash();
        x.check_balance();
        x.withdraw_cash();
        x.transfer();
        x.quit();
        
    }
}