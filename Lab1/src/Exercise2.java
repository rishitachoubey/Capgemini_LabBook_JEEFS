/** 
 * Create a method to checkWrite a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown if a number is an increasing number
 * @author RISHITA CHOUBEY
 *
 */
import java.util.Scanner;
public class Exercise2 {

	private static void Signal( String n)
	{
		if(n.equalsIgnoreCase("red"))
			System.out.println("stop");
		
		else 
			if(n.equalsIgnoreCase("yellow"))
			System.out.println("wait");
		else
			if(n.equalsIgnoreCase("green"))
			System.out.println("go");
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Code : ");
		String code = sc.next();
		Signal(code);
		sc.close();
	}
}
