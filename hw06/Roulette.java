/////////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//hw06
//Loops and stuff
//1000 simulations of 100 spins of roulette
//randomly generated number to bet on
//leave if it comes up 3 times
//if never comes up loose everything
//compute number of times all is lost
//compute total winnings
//compute number of times leaving with a profit out of the 1000 times

//class
public class Roulette{
    //main method
    public static void main(String[] arg){
        //declare/initiate variables
        int betChoice;
        int spinResult;
        int trial = 0;//starting trial number
        int spin = 0;//starting spin number
        int money = 100;//initial betting money
        int winnings = 0;//initial winnings
        int walkAways = 0;//initial times walking away
        int losses = 0;//initial number of times losing everything
        int wins = 0;//initial nuber of wins
        while (trial<1000){//loop for the number of trials
            trial++;//add one to track trials
            spin = 0;//reset spins for every trial
            money = 100;//reset money for each trial
            betChoice = (int)(Math.random()*37);//randomly select betting choice
            while (spin<100){//loop for each spin 
                spin++;//track spins
                money--;//cost to play
                spinResult = (int)(Math.random()*37);//generate spin
                if (betChoice == spinResult){//if you win
                    money = money+36;//get winnings
                    wins++;//track number of wins
                }//end if win
                if (wins==3){//if you won 3 times
                    walkAways++;//tracking number of times leaving table 
                    break;//simulates leaving the table
                }//end if win 3 times
                if (money==0){//if you lose everything
                    losses++;//track number times you lose everything
                }//end if lose everything
                winnings = winnings+(money-100);//track winnings////subtracting out of pocket betting money
            }//end spins loop
        }//end trials loop
        System.out.println("Total times lose everything: "+losses);//print number times lose everything
        System.out.println("Total winnings: "+winnings);//print total winnings
        System.out.println("Total times leaving with a profit: "+walkAways);//print number times you walk away
        
    }//end main method
}//end class