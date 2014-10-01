//Alec Douglass
//9/30/14
//hw05 program 1
//prompt for an order and then details
//Import scanner
import java.util.Scanner;
//class
public class BurgerKing {
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter a letter for order burger(B/b), Soda(S/s), Fries(F/f): ");
        String order = myScanner.next();//accept input as string
        System.out.println(order);
        String detail;
        if (order.equals("B")){
            System.out.println("Enter A or a for 'all the fixings'");
            System.out.println("C or c for cheese");
            System.out.print("N or n for none");
            detail = myScanner.next();//accept input as string
            switch (detail){
                case "A": System.out.println("You ordered a burger with all the fixings"); break;
                case "a": System.out.println("You ordered a burger with all the fixings"); break;
                case "C": System.out.println("You ordered a burger with cheese"); break;
                case "c": System.out.println("You ordered a burger with cheese"); break;
                case "N": System.out.println("You ordered a burger with nothing"); break;
                case "n": System.out.println("You ordered a burger with nothing"); break;
                default: System.out.println("Invalid entry"); break;
            }//end switch B
        }//end if B
        else {//not B
            if (order.equals("S")){
                System.out.print("Pepsi(P/p), Coke(C/c), Sprite(S/s), Mountain Dew(M/m)");
                detail = myScanner.next();//accept input as string
                switch (detail) {
                    case "P": System.out.println("You ordered a Pepsi"); break;
                    case "p": System.out.println("You ordered a Pepsi"); break;
                    case "C": System.out.println("You ordered a Coke"); break;
                    case "c": System.out.println("You ordered a Coke"); break;
                    case "S": System.out.println("You ordered a Sprite"); break;
                    case "s": System.out.println("You ordered a Sprite"); break;
                    case "M": System.out.println("You ordered a Mountain Dew"); break;
                    case "m": System.out.println("You ordered a Mountain Dew"); break;
                    default: System.out.println("Invalid entry"); break;
                }//end nested S
            }//end if S
            else {
                if (order.equals("F")){
                System.out.print("Large or small? (L,l,S,s)");
                detail = myScanner.next();//accept input as string
                    switch (detail) {
                        case "L": System.out.println("You ordered a large fry"); break;
                        case "l": System.out.println("You ordered a large fry"); break;
                        case "S": System.out.println("You ordered a small fry"); break;
                        case "s": System.out.println("You ordered a small fry"); break;
                        default: System.out.println("Invalid entry"); break;
                    }//end nested f
                }//end if F
                else {
                    if (order.equals("b")){
                        System.out.println("Enter A or a for 'all the fixings'");
                        System.out.println("C or c for cheese");
                        System.out.print("N or n for none");
                        detail = myScanner.next();//accept input as string
                        switch (detail){
                            case "A": System.out.println("You ordered a burger with all the fixings"); break;
                            case "a": System.out.println("You ordered a burger with all the fixings"); break;
                            case "C": System.out.println("You ordered a burger with cheese"); break;
                            case "c": System.out.println("You ordered a burger with cheese"); break;
                            case "N": System.out.println("You ordered a burger with nothing"); break;
                            case "n": System.out.println("You ordered a burger with nothing"); break;
                            default: System.out.println("Invalid entry"); break;
                        }//end switch B
                    }//end if b
                    else {
                        if (order.equals("s")){
                            System.out.print("Pepsi(P/p), Coke(C/c), Sprite(S/s), Mountain Dew(M/m)");
                            detail = myScanner.next();//accept input as string
                            switch (detail) {
                                case "P": System.out.println("You ordered a Pepsi"); break;
                                case "p": System.out.println("You ordered a Pepsi"); break;
                                case "C": System.out.println("You ordered a Coke"); break;
                                case "c": System.out.println("You ordered a Coke"); break;
                                case "S": System.out.println("You ordered a Sprite"); break;
                                case "s": System.out.println("You ordered a Sprite"); break;
                                case "M": System.out.println("You ordered a Mountain Dew"); break;
                                case "m": System.out.println("You ordered a Mountain Dew"); break;
                                default: System.out.println("Invalid entry"); break;
                            }//end nested S
                        }//end if s
                        else {
                            if (order.equals("f")){
                                System.out.print("Large or small? (L,l,S,s)");
                                detail = myScanner.next();//accept input as string
                                switch (detail) {
                                    case "L": System.out.println("You ordered a large fry"); break;
                                    case "l": System.out.println("You ordered a large fry"); break;
                                    case "S": System.out.println("You ordered a small fry"); break;
                                    case "s": System.out.println("You ordered a small fry"); break;
                                    default: System.out.println("Invalid entry"); break;
                                }//end nested f
                            }//end if f
                            else {
                                System.out.println("Invalid Entry");
                            }//end not f    
                        }//end not s
                    }//end not b
                }//end not F
            }//end not S
        }//end not B
    }//end main method
}//end class