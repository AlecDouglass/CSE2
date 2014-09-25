//Alec Douglass
//lab 05

//get a letter give a game

//import Scanner
import java.util.Scanner;
//class
public class RandomGames {
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter R or r for roulette, C or c for craps, or P or p for pick a card: ");//prompt for game choice
        String game = ((String) myScanner.next() (System.in));//accept input as srting
        if (game.length() > 1){//length error
            System.out.println("a single character is expected");//print 
            return;//terminate
        }//end length error
        else{//no length error
            if (game == R || game==r){//if roulette
                
            }//end if roulette
            else{//not roulette
                if (game==C || game==c){//if craps
                    
                }//end if craps
                else{//not craps
                    if (game==P || game==p){//if pick a card
                        
                    }//end if pick a card
                    else{//no valid games selected
                        System.out.println(game+" is not a valid input");
                        return;
                    }//end no valid games selected
                    
                }//end not craps
            }//end not roulette
            
        }//end no length error
        
    }//end method
}//end class