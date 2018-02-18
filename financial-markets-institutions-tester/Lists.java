
/**
 * Quiz Tester for Numerical Exercises.
 * 
 * @Filippos A. Zofakis 
 * @09/09/2016
 */
import java.util.*;

public class Lists
{       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Boolean correctAnswer=false;
        String answer;
/*
        correctAnswer = false;
        System.out.println("What are the 11 types of Financial Intermediaries?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.contains("commercial banks") && answer.contains("mutual funds") && answer.contains("private pension funds") && answer.contains("life insurance companies") && answer.contains("money market funds") && answer.contains("government-sponsored enterprises")
            && answer.contains("government pension funds") && answer.contains("finance companies") && answer.contains("casualty insurance companies") && answer.contains("savings institutions") && answer.contains("credit unions"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

            */
        correctAnswer = false;
        System.out.println("What are the 5 risks faced by financial institutions?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.contains("credit") && answer.contains("interest rate") && answer.contains("liquidity") && answer.contains("foreign exchange") && answer.contains("political"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

        correctAnswer = false;
        System.out.println("What are the 5 intermediation services?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.contains("denomination divisibility") && answer.contains("currency conversion") && answer.contains("maturity flexibility") && answer.contains("credit risk diversification") && answer.contains("liquidity"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
            correctAnswer = false;
        System.out.println("What are the 6 goals of monetary policy?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.contains("full employment") && answer.contains("economic growth") && answer.contains("price index stability") && answer.contains("interest rate stability") && answer.contains("financial system stability") && answer.contains("foreign exchange markets stability"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
        keyboard.close();}

} 
