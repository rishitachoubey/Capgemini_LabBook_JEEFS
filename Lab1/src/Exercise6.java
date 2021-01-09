** 
 * Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 * @author RISHITA CHOUBEY
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		int n=10;
		int res= calculateDifference(n);
		System.out.println("The difference is: "+res);

	}

	private static int calculateDifference(int n) {
		int Sum=0;
		int sumofSquare=0;
		int squareofSum=0;
		
		for(int i=1; i<=n;i++)
		{
			sumofSquare=sumofSquare+(i*i);
			squareofSum= (squareofSum+i);
		}
		Sum= sumofSquare-(squareofSum*squareofSum);
		
		return Sum;		
	}

}
