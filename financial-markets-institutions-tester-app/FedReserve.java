
/**
 * Quiz Tester for the Federal Reserve Questions.
 * 
 * @Filippos A. Zofakis 
 * @18/09/2016
 */
import java.util.*;

public class FedReserve
{       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Boolean correctAnswer=false;
        String answer;

        System.out.println("All members banks must own some stock\nin the Federal Reserve Bank of their district.");
        System.out.println("How much dividend (in %) do they get in return:");
        answer = keyboard.next();
        while (!answer.equals("6"))
        {System.out.println("Wrong... Try again.");
            answer = keyboard.next();}
        System.out.println("Correct!\n");

        System.out.println("How many district Federal Reserve Banks are there?");
        answer = keyboard.next();
        while (!answer.equals("12"))
        {System.out.println("Wrong... Try again.");
            answer = keyboard.next();}
        System.out.println("Correct!\n");

        System.out.println("About how many commercial banks are members of the Federal Reserve System?");
        answer = keyboard.next();
        while (!answer.equals("3000"))
        {System.out.println("Wrong... Try again.");
            answer = keyboard.next();}
        System.out.println("Correct!\n");

        System.out.println("How many members does the Board of Governors have?");
        answer = keyboard.next();
        while (!answer.equals("7"))
        {System.out.println("Wrong... Try again.");
            answer = keyboard.next();}
        System.out.println("Correct!\n");

        System.out.println("How many members does the Federal Open Market Committee (FOMC) have?");
        answer = keyboard.next();
        while (!answer.equals("12"))
        {System.out.println("Wrong... Try again.");
            answer = keyboard.next();}
        System.out.println("Correct!\n");

        Random rnd = new Random();
        int number = rnd.nextInt(15);
        int number2 = rnd.nextInt(999);

        System.out.println("Let's assume a simplistic reserve requirement k = "+number+"%.");
        System.out.println("Total deposits of an institution are: DEP = $"+number2+" million.");
        System.out.println("How much are the required reserves?");
        System.out.print("RR = ");
        double ans = keyboard.nextDouble();
        while (ans!=number*number2/100.0)
        {System.out.println("Wrong... Try again.");
            ans = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        number = 2*rnd.nextInt(100);
        number2 = rnd.nextInt(100);
        System.out.println("If total reserves TR = $"+number+" million");
        System.out.println("and required reserves are RR = $"+number2+" million,");
        System.out.println("then how much are the excess reserves?");
        System.out.print("ER = ");
        ans = keyboard.nextDouble();
        while (ans!=number-number2)
        {System.out.println("Wrong... Try again.");
            ans = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        number = rnd.nextInt(100);
        number2 = rnd.nextInt(100);
        System.out.println("If a bank has a balance at the Fed of $"+number+" million");
        System.out.println("and vault cash of $"+number2+" million,");
        System.out.println("then how much are the total reserves?");
        System.out.print("TR = ");
        ans = keyboard.nextDouble();
        while (ans!=number+number2)
        {System.out.println("Wrong... Try again.");
            ans = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        System.out.println("What are the 3 tools of monetary policy?");
        keyboard.nextLine();
        answer = keyboard.nextLine();

        while (!answer.contains("reserve requirements") && !answer.contains("open market operations") && !answer.contains("discount rate"))
        {System.out.println("Wrong... Try again.");
            answer = keyboard.nextLine();}
        System.out.println("Correct!");

        keyboard.close();}

} 
