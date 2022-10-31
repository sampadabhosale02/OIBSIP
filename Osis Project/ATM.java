import java.util.*;

class ATM{

    private string username;
    private int pin;
    private float amount;
    private float balance,total;


    ATM(){

        balance = 0.0f;
    }

    void accept{

        System.out.println("Enter valid username");
        Scanner sc = new Scanner(System.in);
        username = sc.next();
        System.out.println("Enter correct pin");
        pin = sc.nextInt();
        
    }

    void check{
        int i,ch;
        int flag = 0;
        for (i=0 ; i<3 ; i++){
            System.out.println("You have "+(3-i) +" chances left to guess the right number.");
		    System.out.println("");
            accept();
        
            if(username >= 'a' && username <= 'z' && pin >= 0 && pin <= 9){
                System.out.println("Succesful Login !!");

                System.out.println("Select operations to be performed");
                System.out.println("1.Withdraw Cash");
                System.out.println("2.Deposit Cash");
                System.out.println("3.Check Balance");
                System.out.println("4.Transfer");
                System.out.println("6.Quit");

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
            else{
                system.out.println("Invalid Username and password");
                flag = 1;
            }
            if (flag == 1){
                System.exit(0);
            }
        }

    }

    void balance(float x){

        balance = total;
        System.out.println("Toatl balance available is " + balance);
    }

    void withdraw_cash{
        System.out.println("Enter amount to be withdrawn");
        amount = sc.nextFloat();

        if (amount <= balance ){
            System.out.println(amount + "withdrawn successfully");
            total = balance - amount ;
            balance(total);
        }

    }


}

class Test{

    public static void main(String args[]) {

        ATM x = new ATM();
        x.accept();
        x.check();
        x.balance();
        x.withdraw_cash();
        
    }
}