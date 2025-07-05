import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to the number guessing game!");
        int rngnum=(int)(Math.random()*101);//random number between 0 and 100
        int number_attempts=0;
        System.out.println("the number is between 0 and 100,try and guess it!");
        Scanner sc=new Scanner(System.in);
        int userguess;
        while(true)
        {
            userguess=sc.nextInt();
            if(userguess==rngnum)
            {
                number_attempts++;
                System.out.println("Congratulations! You guessed it!");
                System.out.println("Number of attempts: "+number_attempts);

            }
            else if(userguess>rngnum)
            {
                System.out.println("too high");
                number_attempts++;
                System.out.println("Attempts: "+number_attempts);
            }
            else if(userguess<rngnum)
            {
                System.out.println("too low");
                number_attempts++;
                System.out.println("Attempts: "+number_attempts);
            }


        }
    }
}