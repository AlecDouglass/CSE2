//Alec Douglass
//09/16/2014
//hw03 program 2

//user input a double
//output rough estimate for cube root

//import scanner
import java.util.Scanner;
//class
public class Root{
    //main method
    public static void main(String[] args){
        Scanner myScanner;//declare Scanner
        myScanner = new Scanner (System.in);//scanner constructor
        System.out.print("Enter a double ");//input prompt
        double x = myScanner.nextDouble();//accept scanner as double
        double guess = x/3;//first guess
        //improve the guess
        guess = (guess*guess*guess+x)/(3*guess*guess);
        guess = (guess*guess*guess+x)/(3*guess*guess);
        guess = (guess*guess*guess+x)/(3*guess*guess);
        guess = (guess*guess*guess+x)/(3*guess*guess);
        guess = (guess*guess*guess+x)/(3*guess*guess);
        //print out the guess
        System.out.println(guess);
        
        
    }//end main method
}//end class
//I do not really understand the calculation part of this code