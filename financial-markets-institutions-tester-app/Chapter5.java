
/**
 * Quiz Tester for Numerical Exercises.
 * 
 * @Filippos A. Zofakis 
 * @10/15/2016
 */
import java.util.*;

public class Chapter5
{       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double answer;
        System.out.println("1. $2000 offering 6.25% compounded daily.");
        System.out.println("After 4 years, assuming no further deposits,\nwhat will be the balance in the account?");

        double PV, futureValue, rate, n;//FV, discount rate r (or ytm), number of periods n

        PV = 2000;
        rate = 0.0625 / 365;
        n = 4 * 365;

        double correctAns = getFV(PV, n, rate);

        //testing
        //System.out.println(correctAns);

        answer = keyboard.nextDouble();

        while (Math.abs(answer-correctAns)>=1)
        {   System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble(); }
        System.out.println("Correct!\n");

        System.out.println("3. $1000 corporate bond maturing in 5 years");
        System.out.println("5% annual coupon");
        System.out.println("Aa rating: yield = 7%");
        System.out.println("Aa rating: yield = 7%");
        System.out.println("Price of Bond = ?");

        System.out.println("Assume annual compounding.");

        double F = 1000; //face/par value
        n = 5;
        double coupon = 0.05 * 1000;
        rate = 0.07;

        correctAns = getPV(F, n, rate) + getAnnuityPV(F, n, coupon, rate);

        answer = keyboard.nextDouble();

        while (Math.abs(answer-correctAns)>=1)
        {   System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble(); }
        System.out.println("Correct!\n");

        System.out.println("Now assume semiannual compounding for the same pricing problem.");

        //coupon remains the same because it is still paid out annually
        //but it is now only paid out every 2nd period
        //only the number of periods and the rate change
        n *= 2;
        rate /= 2;

        correctAns = getPV(F, n, rate) + coupon/Math.pow(1+rate, 2) + coupon/Math.pow(1+rate, 4) + coupon/Math.pow(1+rate, 6) + coupon/Math.pow(1+rate, 8) + coupon/Math.pow(1+rate, 10);

        //System.out.println(correctAns);
        
        answer = keyboard.nextDouble();

        while (Math.abs(answer-correctAns)>=1)
        {   System.out.println("Wrong answer... Try again.");
            answer = keyboard.nextDouble(); }
        System.out.println("Correct!\n");

        keyboard.close();}

    public static double getPV(double F, double n, double rate) {

        return F/Math.pow(1+rate, n);

    }

    public static double getAnnuityPV(double F, double n, double coupon, double rate) {

        return coupon * (1-Math.pow(1+rate, -n))/rate;

    }

    public static double getFV(double PV, double n, double rate) {

        return PV * Math.pow(1+rate, n);

    }
} 
