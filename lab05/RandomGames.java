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
        String game = myScanner.nextLine();//accept input as srting
        if (game.length() > 1){//length error
            System.out.println("a single character is expected");//print 
            return;//terminate
        }//end length error
        else{//no length error
            if (game.equals("R") | game.equals("r")){//if roulette
                int randR = (int)(Math.random()*37);
                switch (randR){
                    case 0: System.out.println("Roulette: 0"); break;
                    case 1: System.out.println("Roulette: 1"); break;
                    case 2: System.out.println("Roulette: 2"); break;
                    case 3: System.out.println("Roulette: 3"); break;
                    case 4: System.out.println("Roulette: 4"); break;
                    case 5: System.out.println("Roulette: 5"); break;
                    case 6: System.out.println("Roulette: 6"); break;
                    case 7: System.out.println("Roulette: 7"); break;
                    case 8: System.out.println("Roulette: 8"); break;
                    case 9: System.out.println("Roulette: 9"); break;
                    case 10: System.out.println("Roulette: 10"); break;
                    case 11: System.out.println("Roulette: 11"); break;
                    case 12: System.out.println("Roulette: 12"); break;
                    case 13: System.out.println("Roulette: 13"); break;
                    case 14: System.out.println("Roulette: 14"); break;
                    case 15: System.out.println("Roulette: 15"); break;
                    case 16: System.out.println("Roulette: 16"); break;
                    case 17: System.out.println("Roulette: 17"); break;
                    case 18: System.out.println("Roulette: 18"); break;
                    case 19: System.out.println("Roulette: 19"); break;
                    case 20: System.out.println("Roulette: 20"); break;
                    case 21: System.out.println("Roulette: 21"); break;
                    case 22: System.out.println("Roulette: 22"); break;
                    case 23: System.out.println("Roulette: 23"); break;
                    case 24: System.out.println("Roulette: 24"); break;
                    case 25: System.out.println("Roulette: 25"); break;
                    case 26: System.out.println("Roulette: 26"); break;
                    case 27: System.out.println("Roulette: 27"); break;
                    case 28: System.out.println("Roulette: 28"); break;
                    case 29: System.out.println("Roulette: 29"); break;
                    case 30: System.out.println("Roulette: 30"); break;
                    case 31: System.out.println("Roulette: 31"); break;
                    case 32: System.out.println("Roulette: 32"); break;
                    case 33: System.out.println("Roulette: 33"); break;
                    case 34: System.out.println("Roulette: 34"); break;
                    case 35: System.out.println("Roulette: 35"); break;
                    case 36: System.out.println("Roulette: 36"); break;
                    case 37: System.out.println("Roulette: 00"); break;
                }
            }//end if roulette
            else{//not roulette
                if (game.equals("C") | game.equals("c")){//if craps
                    int randCA = (int)(Math.random()*5)+1;
                    int randCB = (int)(Math.random()*5)+1;
                    int total = randCB+randCA;
                    System.out.println("Craps: "+randCB+"+"+randCA+"="+total);
                }//end if craps
                else{//not craps
                    if (game.equals("P") | game.equals("p")){//if pick a card
                        int suit = (int)(Math.random()*3);
                        int card = (int)(Math.random()*12);
                        String Face;
                        String Family = "";
                        switch (suit){
                            case 0: Family = "Clubs"; break;
                            case 1: Family = "Hearts"; break;
                            case 2: Family = "Diamonds"; break;
                            case 3: Family = "Spades"; break;
                        }//end suit
                        switch (card){
                            case 0: Face = "Ace"; break;
                            case 1: Face = "Jack"; break;
                            case 11: Face = "Queen"; break;
                            case 12: Face = "King"; break;
                            default: Face = Integer.toString(card); break;
                        }//end card
                        System.out.println(Face+" of "+Family);
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
//////////note to self remember the string.equals() thing////////////
//////////////////////////////////////////////////////////////////////////////////////////////