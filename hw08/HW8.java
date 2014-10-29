////////////////////////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//hw08
//driver program
//writing methods
//overloading methods
//forcing good inputs
import java.util.Scanner;
public class HW8{
    public static char getInput(Scanner scan, String enter){//C or c
        scan = new Scanner(System.in);//declare and call
        String i = scan.nextLine();//accept string input
        while (!i.equals("C") && !i.equals("c")){//loop for when input is bad 
            System.out.println("You did not enter a character from the list 'Cc'; try again- ");//ask again
            i = scan.nextLine();//accept new input
        }
        char c=i.charAt(0);//convert string to char
        return c;//return char
    }
    public static char getInput(Scanner scan, String enter, int x){//yYnY only 5 times
        scan = new Scanner(System.in);//declare and call
        String i = scan.nextLine();//acept input
        int y=1;//initialize tracker
        while(!i.equals("Y") && !i.equals("y") && !i.equals("N") && !i.equals("n")){//when iput is bad
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");//reprompt
            i = scan.nextLine();//reaccept input
            y++;//track trials
            if (y==x){//when fail 5 times
                System.out.println("You failed after 5 attempts");//inform user of failed attempts
                return ' ';//return empty
            }
        }
        char c=i.charAt(0);//convert good input to char
        return c;//return good input
    }
    public static char getInput(Scanner scan, String enter, String choice){//for numbers
        scan = new Scanner(System.in);//declare and call
        System.out.println(enter);//prompt
        System.out.print(choice);//prompt
        String i = scan.nextLine();//accept input
        while(!i.equals("0")&&!i.equals("1")&&!i.equals("2")&&!i.equals("3")&&!i.equals("4")&&!i.equals("5")&&!i.equals("6")&&!i.equals("7")&&!i.equals("8")&&!i.equals("9")){//for bad input
            System.out.println("You did not enter an acceptable character");//inform user of mistake
            System.out.println(enter);//reprompt
            System.out.print(choice);//reprompt
            i = scan.nextLine();//reaccept input
        }
        char c=i.charAt(0);//convert good input to char
        return c;//return good input
    }
    public static void main(String[] arg){//main method
        char input;//declare input char
        Scanner scan=new Scanner(System.in);//declare and call Scanner
        System.out.print("Enter 'C' or 'c' to continue- ");//prompt for method one
        input=getInput(scan,"Cc");//call first method
        System.out.println("You entered '"+input+"'");//print result from first method
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//prompt for second method
        input=getInput(scan,"yYnN",5); //give up after 5 attempts////////call second method
        if(input!=' '){//if the user gives good input
       	    System.out.println("You entered '"+input+"'");//print result second methos
        }
        input=getInput(scan,"Choose a digit.","0123456789: ");//call last methos
        System.out.println("You entered '"+input+"'");//print result from last method
        
    }//end main method   
}//end class