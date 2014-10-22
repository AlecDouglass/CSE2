////////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//Hw07
//loops for patterns

//Scanner
import java.util.Scanner;
//class
public class NumberStack{
    //main method
    public static void main(String[] arg){
        Scanner scan = new Scanner (System.in);//declare and call
        int n = 0;//input
        System.out.print("Enter an integer 1-9: ");//prompt
        int t = 0;//
        int c = 1;
        int l = 1;
        if (scan.hasNextInt()){
            n = scan.nextInt();
            if (n>0&&n<10){
                for (c=1;c<(n+1);c++){//n starts at one loops until hits 9
                    t = 0;
                    int end = 2*c-1;
                    for (l=1;l<(c+1);l++){
                        for (t=0;t<end;t++){
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    for (t=0;t<end;t++){
                        System.out.print("-");
                    }
                    System.out.println("");   
                }
            }//end if good input
            else{//bad input 2
                System.out.println("Invalid input");
            }//end bad input 2
        }//end good int
        else{//bad input 1
            System.out.println("Invalid input");
        }//end else bad input 1
        c=1;
        t=0;
        l=1;
        System.out.print("Enter an integer 1-9: ");//prompt
        if (scan.hasNextInt()){
            n = scan.nextInt();
            if (n>0&&n<10){
                while (c<(n+1)){
                    t=0;
                    int end = 2*c-1;
                    l=1;
                    while (l<(c+1)){
                        t=0;
                        while (t<end){
                            System.out.print(c);
                            t++;
                        }
                        l++;
                        System.out.println();
                    }
                    t=0;
                    while (t<end){
                        System.out.print("-");
                        t++;
                    }
                    System.out.println();
                    c++;
                }
            }
            else{
                System.out.println("NO");
            }
        }//end if
        else{
            System.out.println("Bad");
        }
        System.out.println();
        c=1;
        t=0;
        l=0;
        System.out.print("Enter an integer 1-9: ");//prompt
        if (scan.hasNextInt()){
            n = scan.nextInt();
            if (n>0&&n<10){
                do{
                    t=0;
                    int end = 2*c-1;
                    l=0;
                    do{
                        do{
                            System.out.print(c);
                            t++;
                        }while(t<end);
                        l++;
                        System.out.println();
                        t=0;
                    }while(l<c);
                    t=0;
                    do{
                        System.out.print("-");
                        t++;
                    }while(t<end);
                    System.out.println();
                    c++;
                }while(c<(n+1));
                
            }
            else{
                System.out.println("nope");
            }
        }
        else{
            System.out.println("try reading the directions");
        }
    }//end main method
}//end class