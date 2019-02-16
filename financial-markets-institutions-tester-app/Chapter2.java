
/**
 * Quiz Tester for Numerical Exercises.
 * 
 * @Filippos A. Zofakis 
 * @09/09/2016
 */
import java.util.*;

public class Chapter2
{       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double answer;
        System.out.println("Assume the olden days.\nThree banks A, B and C put $100 each in bullion in a clearing house.");
        int reservesA = 100;
        int  reservesB = 100;
        int reservesC = 100;
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        int num2 = rnd.nextInt(100);
        System.out.println("Assume someone writes a check for $"+number + " on A and it gets deposited in C.");
        reservesA -= number;
        reservesC += number;
        System.out.println("Also assume someone writes a check for $"+num2 + " on B and it gets deposited in A.");
        reservesB -= num2;
        reservesA += num2;

        System.out.println("After the checks get processed,\nhow much of the bullion is owned by each of the banks?");

        System.out.println("First enter the value of A's reserves:");
        answer = keyboard.nextDouble();
        while (!(answer==reservesA))
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        System.out.println("Now enter the value of B's reserves:");
        answer = keyboard.nextDouble();  
        while (!(answer==reservesB))
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        System.out.println("Now the same for C:");
        answer = keyboard.nextDouble();  
        while (!(answer==reservesC))
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        System.out.println("What is the schedule used in calculating a bank's required reserves?");
        System.out.println("Enter the first number of the .../... schedule:");
        answer = keyboard.nextDouble();
        while (!(answer==15.2))
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        System.out.println("Now enter the second number of the .../... schedule:");
        answer = keyboard.nextDouble();
        while (!(answer==110.2))
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        number = rnd.nextInt(799);
        num2 = rnd.nextInt(100);
        int num3 = rnd.nextInt(100);
        double corrAns;

        if (number<=15.2)
        {corrAns = 0;}
        else if (number<=110.2)
        {corrAns = (number - 15.2)*.03;}
        else {corrAns = (number - 110.2)*.1 + 2.85;}
        corrAns *= 100;
        corrAns = Math.round(corrAns);
        corrAns /=100;

        System.out.println("If the bank has $"+number+" million in transaction deposits,");
        System.out.println("$"+num2+" million in savings accounts, and $"+num3+" million in CDs,");
        System.out.println("what are its required reserves according to the schedule?");
        //System.out.println(corrAns);
        answer = keyboard.nextDouble();

        while (answer!=corrAns)
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        number = rnd.nextInt(999);
        System.out.println("The Fed Funds rate is based on a 360-day year.");
        System.out.println("Fed Funds rate: 2.25%");
        System.out.println("What is the interest on borrowing $"+number+" million overnight?");
        System.out.println("Enter it in thousands:");
        double interest = 1000* number*(0.0225/360);
        // interest *= 10;
        //interest = Math.round(interest);
        // interest /= 10;
        // System.out.println(interest);
        answer = keyboard.nextDouble();

        while (answer!=interest)
        {System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble();}
        System.out.println("Correct!\n");

        keyboard.close();}

} 
