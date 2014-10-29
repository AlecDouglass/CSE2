/////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//lab09
//Methods
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Methods{
	public static int getInt(Scanner scan){
		scan=new Scanner(System.in);
		int count=0;
		for (count=0;count<3;count++){
			System.out.print("Enter and int: ");
			while (!scan.hasNextInt()){
				System.out.print("Not an int, try again- ");
			}
			int i = scan.nextInt();
			return i;
		}
		int i = scan.nextInt();
		return i;
	}
	public static int larger(int a,int b){
		Scanner scan=new Scanner(System.in);
		a=getInt(scan);
		b=getInt(scan);
		if (a>b){
			return a;
		}
		else{
			return b;
		}
	}
	public static boolean ascending(int a, int b, int c){
		Scanner scan=new Scanner(System.in);
		a=getInt(scan);
		b=getInt(scan);
		c=getInt(scan);
		if (a<b&b<c){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The largest of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
}