
package excercises;

import java.util.Scanner;

public class recursionAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many boys would you like?");
		int count = scan.nextInt();
		Boy(count);
	}
	public static void Boy(int count) {
		 System.out.println ("    /:''|    ");    
		  System.out.println ("   |: 00|_   ");  
		  System.out.println ("   C     _)  ");  
		  System.out.println ("    \\ ._|      ");
		  System.out.println ("     ) /       ");
		  System.out.println ("    /` \\       ");
		  System.out.println ("   || |Y|       ");      
		  System.out.println ("   || |#|       ");     
		  System.out.println ("   || |#|       ");   
		  System.out.println ("   :| |=:       "); 
		  System.out.println ("   ||_|,|      ");
		  System.out.println ("  |~`-`~|   ");
		  System.out.println ("  |     |    ");
		  System.out.println ("  |_____|    ");
		  System.out.println ("  |_____|    ");
		  System.out.println ("    | ||       ");
		  System.out.println ("    |_||__        ");
		  System.out.println ("    (____))    ");
		  if(count <= 1) {
				return;
			}
		  Boy(count - 1); 
	}
	

}
