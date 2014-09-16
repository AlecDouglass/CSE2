//Alec Douglass
//09/10/2014
//Get data input from user and use data for simple computations

//Computes the cost of buying some Big Macs
//Uses scanner class to get number of Big Macs, cost per Big Mac, and tax percentage
//then it displays the final cost

import java.util.Scanner;
public class BigMac {
    //Main method required
    public static void main(String[] args) {
        Scanner myScanner;//declare scanner
        myScanner = new Scanner (System.in);//call scanner constructor
        System.out.print("Enter number of Big Macs as an integer > 0: ");//prompt user for input
        //System.out.print, instead of System.out.println, the cursor will not go to the beginning of the next line
        int nBigMacs = myScanner.nextInt();//accept user input...method for scanner objects
        //prompt for cost and tax
        System.out.print("Enter the cost of each Big Mac as " + "a double (in form xx.xx)");//input for cost
        double bigMac$ = myScanner.nextDouble();//accepting the double input
        System.out.print("Enter the tax percentage as whole number (xx): ");//tax prompt
        double taxRate = myScanner.nextDouble();//accepting tax rate
        taxRate/=100; //input was percent need proportion
        
        //now print the outputs for cost
        double cost$;
        int dollars,//whole dollar cost amount
        dimes, pennies;//decimal places to the right
        cost$=nBigMacs*bigMac$*(1+taxRate);//cost calculation
        //just the whole number price
        dollars=(int)cost$;
        //get dime amount
        dimes=(int)(cost$*10)%10; //% mod gives the remainder after division
        pennies=(int)(cost$*100)%100;//same process as for dimes in next decimal
        //print out the price
        System.out.println("the total cost of " +nBigMacs+ " BigMacs at $" +bigMac$+ " per BigMac, with a" +
        " sales tax of " +taxRate+ "%, is $" +dollars+ "." + dimes + pennies);
        
        
        
    }//end main method
}//end class