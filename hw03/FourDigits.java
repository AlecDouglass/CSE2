//Alec Douglass
//09/16/14
//hw03 program 3

//get a number from user print first 4 digits after the decimal

//import scanner
import java.util.Scanner;
//class
public class FourDigits{
    //main method
    public static void main (String[] args) {
        Scanner myScanner;//declare scanner
        myScanner = new Scanner (System.in);
        //prompt user for a number
        System.out.print("Enter a number, the first 4 digits to the right of the decimal will be printed ");
        double number = myScanner.nextDouble();//accept the input
        int first, second, third, fourth;//declare the digits
        first = (int)(number*10)%10;//first digit
        second = (int)(number*100)%10;//second digit
        third = (int)(number*1000)%10;//third digit
        fourth = (int)(number*10000)%10;//fourth digit
        
        //Print out the digits
        System.out.println("The first four digits after the decimal are " +
        first + second + third + fourth);
        
        
        
    }//end main method
}//end class