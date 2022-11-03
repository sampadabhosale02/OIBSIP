import java.util.*;
import java.util.Random;

class Game{

    final private int max;
    private int no;
    private int computer;
    Game()
    {
        
        max = 100;
        Random random = new Random();
        computer = random.nextInt(max);
        System.out.println("******Guess The Number******");
	  System.out.println("");

    }

    void accept()
    {
        System.out.println("Enter Number between 1 to 100.");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        System.out.println("Entered number is " + no);
    }

    void check(){
        int i;
        int flag = 0;
        for(i=0; i <10  ;i++){
		System.out.println("You have "+(10-i) +" chances left to guess the right number.");
		System.out.println("");
            accept();
            if(computer == no)
            {
                System.out.println("Hurray !! You Guessed a right number in "+i +" iterations.");
                flag = 1;
            }
            else if(computer > no)
            {
                System.out.println("The number guessed is small.");

            }
            else
            {
                System.out.println("The number guessed is big.");

            }
		System.out.println("--------------------------");
		if (flag == 1)
        	{
            	System.exit(0);
       	} 
        }
        	

    }

}

class Test{

    public static void main(String args[]) {
        Game g = new Game();
        
        g.check();
        
    }
}