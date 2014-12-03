
import java.util.Scanner;
public class whatever{
	public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        int n=0;
        String i="";
        while(!i.equals("exit")){
            System.out.print("Enter an important life decision(Yes or no questions only): ");
            i=scan.nextLine();
            if (i.equals("exit")){
                break;
            }
            n=(int)(Math.random()*10);
            if (n%2==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
	}
}
