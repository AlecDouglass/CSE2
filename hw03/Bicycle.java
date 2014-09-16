//Alec Douglass
//09/16/2014
//user input data, arithmetic operations

//prompt user for two numbers
//first for number of counts on a cyclometer
//second for time over which the counts occurred
//then print the distance traveled and average speed in mph
//assume wheel diameter 27.0inches

//first import the scanner
import java.util.Scanner;
//then the class
public class Bicycle {
    //main method
    public static void main(String[] args) {
        Scanner myScanner;//declaring the scanner
        myScanner = new Scanner (System.in);//calling scanner constructor
        System.out.print("Enter the number of counts on cyclometer as integer > 0: ");//counts prompt
        int nCounts =myScanner.nextInt();//accepting the user input
        System.out.print("Enter the number of seconds for the trip: ");//prompt for the time
        int time = myScanner.nextInt();//accept number of seconds
        //Now for the known variables 
        double wheelDiameter = 27.0,
        PI  = 3.14159,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerHour = 3600;
        double distance, speed;
        //NOW for calculations
        distance = (PI*wheelDiameter*nCounts)/(inchesPerFoot*feetPerMile);//computing distance in miles
        speed = distance/(time/secondsPerHour);//computing mph
        //PRINT OUT RESULT
        System.out.println("The total distance of the trip was " +distance+ "miles, " +
        "and the average speed was " +speed+ "mph.");
        
    }//end main method
}//end class

