import java.util.Scanner;
public class Exercise1 {
	
	
		
		public static void main (String args[]) 
		{
			
			System.out.println(" Select a light among red , yellow , green " ) ;
			Scanner sc = new Scanner(System.in) ;
			String str = sc.nextLine() ;
			if ( str.equals("Red"))
			{
				System.out.println (" STOP ") ;
			}
			else if ( str.equals("Yellow"))
				{
					System.out.println (" READY") ;
				}
			
				else if ( str.equals("Green")) 
					{
						System.out.println (" GO") ;
					}
				
					else {
						System.out.println (" INVALID") ;
					}
		} 
	}


