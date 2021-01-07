/**
 * Create a method to check if a number is an increasing number
 * @author RISHITA CHOUBEY
 *
 */
public class Exercise7 {


public static void main(String args[]) {
      int number = 2341899;
      boolean a = checknumber(number);
      System.out.println(a);
    }
   
    public static boolean checknumber(int num) {
        int digit = 0;
        int prev = 0;
        while(num!=0){
            digit=num%10;
            prev=(num/10)%10;
            if (digit<prev)
               return false;
            num=num/10;
        }
        return true;
    }
}

