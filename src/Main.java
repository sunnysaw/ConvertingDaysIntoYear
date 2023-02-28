/*
Question : Write a program to convert the given numbers of days into year,month and weeks.
 */
import java.util.Scanner;
public class Main {
    static void NumberOfMonth(int days){
        int year = 365,result,weeks,day1;
        if (days >= year) {
            result = days / year;
            days = days % year;
            System.out.println( "Number of years : " + result);
            weeks = days / 7;
            days = days % 7;
            System.out.println("Number of weeks : " + weeks);
            day1 = days;
            System.out.println("Numbers of days :" + day1);
        }else
            System.out.println("It is not year because a year contains 365 days. plz enter the valid number :");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days :");
        int days = sc.nextInt();
        System.out.println("Printing the result :");
        NumberOfMonth(days);
    }
}