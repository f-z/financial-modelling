
/**
 * Quiz Tester for Numerical Exercises.
 * 
 * @Filippos A. Zofakis 
 * @09/09/2016
 */
import java.util.*;

public class Chapter1
{       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Boolean correctAnswer=false;
        String answer;
        double percentage=0;
        System.out.println("Are we talking about millions, billions or trillions? ");
        System.out.println("Please enter 'million', 'billion' or 'trillion': ");
        String illion = keyboard.next();
        while (!illion.equals("billion") && !illion.equals("trillion") && !illion.equals("million"))
        {System.out.println("Please enter million, billion or trillion:");
            illion = keyboard.next();}
        switch (illion)
        {case "million" :
            System.out.println("What is 1% of 1 million?");
            keyboard.nextLine();
            while (correctAnswer == false) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("10 thousand") || answer.equalsIgnoreCase("10 thou") || answer.equalsIgnoreCase("10 grand") || answer.equalsIgnoreCase("10 large") || answer.equalsIgnoreCase("10G") || answer.equalsIgnoreCase("10K"))
                { System.out.println("Correct!\n");
                    correctAnswer = true;}
                else             {      System.out.println("Wrong... Try again.");}}
            break;
            case "billion" :
            System.out.println("What is 1% of 1 billion?");
            keyboard.nextLine();
            while (correctAnswer == false) {

                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("10 million") || answer.equalsIgnoreCase("10 mill") || answer.equalsIgnoreCase("10 mil") || answer.equalsIgnoreCase("10 rocks") || answer.equalsIgnoreCase("10m"))
                { System.out.println("Correct!\n");
                    correctAnswer = true;}
                else             {      System.out.println("Wrong... Try again.");}}
            break;
            case "trillion" :
            System.out.println("What is 1% of 1 trillion?");
            keyboard.nextLine();
            while (correctAnswer == false) {

                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("10 billion") || answer.equalsIgnoreCase("10 bill") || answer.equalsIgnoreCase("10 bil") || answer.equalsIgnoreCase("10b"))
                {  System.out.println("Correct!\n");
                    correctAnswer = true;}
                else          { System.out.println("Wrong... Try again.");}}
            break;
            default: System.out.println("Error");
            break;

        }
        System.out.println("Now please enter a different percentage.");
        System.out.println("For example enter the number 5 for 5% or a number of your choice:");

        percentage = keyboard.nextDouble();
        percentage *= 10;
        percentage = Math.round(percentage);
        correctAnswer = false;
        int p = 0;
        p = (int)percentage;
        switch (illion)
        {case "million" :
            System.out.println("What is "+(p/10.0) +"% of 1 million?");
            keyboard.nextLine();
            while (correctAnswer == false) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase(p+" thousand") || answer.equalsIgnoreCase(p+" thou") || answer.equalsIgnoreCase(p+" grand") || answer.equalsIgnoreCase(p+" large") || answer.equalsIgnoreCase((percentage * 10)+"G") || answer.equalsIgnoreCase(p+"K"))
                { System.out.println("Correct!\n");
                    correctAnswer = true;}
                else             {      System.out.println("Wrong... Try again.");}}
            break;
            case "billion" :
            System.out.println("What is "+(p/10.0)+"% of 1 billion?");
            keyboard.nextLine();
            while (correctAnswer == false) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase(p+" million") || answer.equalsIgnoreCase(p+" mill") || answer.equalsIgnoreCase(p+" mil") || answer.equalsIgnoreCase(p+" rocks") || answer.equalsIgnoreCase(p+"m"))
                { System.out.println("Correct!\n");
                    correctAnswer = true;}
                else             {      System.out.println("Wrong... Try again.");}}
            break;
            case "trillion" :
            System.out.println("What is "+(p/10.0)+"% of 1 trillion?");
            keyboard.nextLine();
            while (correctAnswer == false) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase(p+" billion") || answer.equalsIgnoreCase(p+" bill") || answer.equalsIgnoreCase(p+" bil") || answer.equalsIgnoreCase(p+"b"))
                {  System.out.println("Correct!\n");
                    correctAnswer = true;}
                else          { System.out.println("Wrong... Try again.");}}
            break;
            default: System.out.println("Error");
            break;

        }

        System.out.println("Now let's talk about countries and their GDP.");
        double population =0;
        double gdp = 0;
        double gdppc = 0;
        double answerGdp =0;
        System.out.println("Think of a country and enter its population in millions:");
        population = keyboard.nextDouble();
        System.out.println("Now enter the country's GDP in billions:");
        gdp = keyboard.nextDouble();
        System.out.println("What is the per capita income of the country:");
        gdppc = (gdp*1000000000)/(population*1000000); 
        while (answerGdp != gdppc) {
            answerGdp = keyboard.nextDouble();
            if (gdppc == answerGdp)
            {  System.out.println("Correct!\n");
            }
            else          { System.out.println("Wrong... Try again.");}}

        double uga = 2;
        Random rnd = new Random();
        int number = rnd.nextInt(2000);
        double numUgas = 0;
        correctAnswer = false;
        System.out.println("We have "+number+" billion. How many UGAs is that?");
        while (!correctAnswer) {
            numUgas = keyboard.nextDouble();
            if (numUgas == (number/uga))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

        correctAnswer = false;
        System.out.println("What is the GDP of the US?");
        answer = "";

        while (!correctAnswer) {
            keyboard.nextLine();
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("18 trillion") || answer.equalsIgnoreCase("18 trill") || answer.equalsIgnoreCase("18 tril") || answer.equalsIgnoreCase("18 tri") || answer.equalsIgnoreCase("18t"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

        correctAnswer = false;
        System.out.println("What is the total US currency outstanding?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("1.4 trillion") || answer.equalsIgnoreCase("1.4 trill") || answer.equalsIgnoreCase("1.4 tril")  || answer.equalsIgnoreCase("1.4 tri") || answer.equalsIgnoreCase("1.4t"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

        correctAnswer = false;
        System.out.println("What is the most common denomination (80%)?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("100") || answer.equalsIgnoreCase("100s"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

        correctAnswer = false;
        System.out.println("How many types of financial intermediaries are there?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("11"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}

        correctAnswer = false;
                System.out.println("The assets of financial intermediaries are ... times the GDP?");
                while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("3"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
             correctAnswer = false;
                System.out.println("What about the capital markets? How much are they worth in total?");
                while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("60 trillion") || answer.equalsIgnoreCase("60 trill") || answer.equalsIgnoreCase("60 tril") || answer.equalsIgnoreCase("60 tri") || answer.equalsIgnoreCase("60t"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
            correctAnswer = false;
                System.out.println("How much is the money market's total value?");
                while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("8 trillion") || answer.equalsIgnoreCase("8 trill") || answer.equalsIgnoreCase("8 tril") || answer.equalsIgnoreCase("8 tri") || answer.equalsIgnoreCase("8t"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
            correctAnswer = false;
        System.out.println("How many categories of financial intermediaries are there?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("4"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
            correctAnswer = false;
        System.out.println("What is the current population of the US?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("320 million") || answer.equalsIgnoreCase("320 mill") || answer.equalsIgnoreCase("320 mil") || answer.equalsIgnoreCase("320m"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
             correctAnswer = false;
        System.out.println("What is the current population of China?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("1.4 billion") || answer.equalsIgnoreCase("1.4 bill") || answer.equalsIgnoreCase("1.4 bil") || answer.equalsIgnoreCase("1.4b"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
             correctAnswer = false;
        System.out.println("How much is current US student loan debt?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("1.3 trillion") || answer.equalsIgnoreCase("1.3 trill") || answer.equalsIgnoreCase("1.3 tril") || answer.equalsIgnoreCase("1.3 tri") || answer.equalsIgnoreCase("1.3t"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
               correctAnswer = false;
        System.out.println("What is the equity portion of capital markets?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if ((answer.equalsIgnoreCase("a third")) || answer.equalsIgnoreCase("1/3") || answer.equalsIgnoreCase("one third"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
             correctAnswer = false;
        System.out.println("How much is total US national debt?");

        while (!correctAnswer) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("19 trillion") || answer.equalsIgnoreCase("19 trill") || answer.equalsIgnoreCase("19 tril")  || answer.equalsIgnoreCase("19 tri") || answer.equalsIgnoreCase("19t"))
            {  System.out.println("Correct!\n");
                correctAnswer = true;
            }
            else          { System.out.println("Wrong... Try again.");}}
            
        keyboard.close();}

} 
