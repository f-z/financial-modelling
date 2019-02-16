
/**
 * Bank Capital Adequacy Calculator.
 * 
 * @Filippos A. Zofakis 
 * @09/09/2016
 */
import java.util.Scanner;

public class CapitalAdequacy
{       public static final double K = 0.12;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double capital = 0, deposits = 0, total = 0, loans = 0, reqRes = 0, extraRes = 0;

        System.out.println("How many $ is the initial capital provided by investors: ");
        capital = keyboard.nextDouble();
        System.out.println("How many $ are the initial deposits: ");
        deposits = keyboard.nextDouble();

        total = capital + deposits;

        System.out.println("How much $ did the bank loan out: ");       
        loans = keyboard.nextDouble();
        reqRes = K * deposits;
        if (loans + reqRes > total) {
            System.out.println("Amount of loans is higher than what is allowed."); 
            System.out.println("Please enter the correct amount: ");  
            loans = keyboard.nextDouble();}

        extraRes = deposits +capital - loans - reqRes;
        System.out.println("\n----------------------------------------------------------");
        System.out.printf("Loans: \t\t%.2f\t|\t", loans);
        System.out.printf("Deposits: \t%.2f\n", deposits);
        System.out.printf("Req. Res.: \t%.2f\t|\t", reqRes);
        System.out.println();
        System.out.printf("Extra Res.: \t%.2f\t|\t", extraRes);         

        System.out.printf("Capital: \t%.2f\n", capital);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Total: \t\t%.2f\t|\t\t", total);
        System.out.printf("\t%.2f\t\n", total);

        Boolean writedown = false;
        System.out.println("\nHave some of the loans gone bad? Do we need to write them down?");
        System.out.print("Enter true/false: ");
        writedown = keyboard.nextBoolean();

        if (writedown)
        {
            System.out.println("\nWhat is the new lower amount of good loans: ");
            double newLoans = keyboard.nextDouble();
            double difLoans = loans - newLoans;
            capital -= difLoans;
            total = capital + deposits;
            loans = newLoans;
            System.out.println("\n----------------------------------------------------------");
            System.out.printf("Loans: \t\t%.2f\t|\t", loans);
            System.out.printf("Deposits: \t%.2f\n", deposits);
            System.out.printf("Req. Res.: \t%.2f\t|\t", reqRes);
            System.out.println();
            System.out.printf("Extra Res.: \t%.2f\t|\t", extraRes);         

            System.out.printf("Capital: \t%.2f\n", capital);
            System.out.println("----------------------------------------------------------");
            System.out.printf("Total: \t\t%.2f\t|\t\t", total);
            System.out.printf("\t%.2f\t\n", total);
        }
        double capAdequacy = capital / loans;
        System.out.printf("\nCapital Adequacy: %.2f",100*capAdequacy);
        System.out.println("%");
        if (capAdequacy >= 0.10)
        {System.out.println("\nGOOD capital adequacy!");}
        else  if (capAdequacy >0)       { System.out.println("\nPOOR capital adequacy!");}
        else { System.out.println("\nTERRIBLE capital adequacy!");}
        keyboard.close();
    }}
