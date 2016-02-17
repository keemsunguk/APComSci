package SmallProgram;
import java.util.Scanner;
import java.lang.Math;

public class MyMath
{
  /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(long n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }

    return true;
  }

  /**
   * Tests Goldbach conjecture for even numbers
   * up to bigNum
   */
  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }
  
  public static int addOdd(int n)
  {
	  int res;
	  int sum = 0;
	  for(int i = 1; i <=n; i+=2) {
		  sum += i;
	  }
	  res = sum;
	  return res;
  }

  /*********************************************************************/

public static void main(String[] args)
{
    boolean done = false;
    int count = 0;
    long exp = 2;
    
    for(int i  =  0; i < 6; i++) {
	    long mersenne_prime = 0;
	    long perfect_no = 0;
	    while(!done) {
	    	mersenne_prime =  (long)Math.pow(2, (double)exp) - 1;
	    	if( isPrime(mersenne_prime)) {
	    	    perfect_no = (long)Math.pow(2, (double)(exp-1)) * mersenne_prime;
	    	    System.out.println("Mersenne Prime is: "+mersenne_prime);
	    	    System.out.println("Perfect number is: "+perfect_no);
	    		done = true;
	    		exp++;
	    	} else {
	    		exp++;
	    	}
	    }
	    done = false;
    }
    
    System.out.println("sum is :"+addOdd(10));
    
    int n = 11;

    String pattern = "O";
    for(int r = 0; r < n; r++) {
    	for(int c = 0; c < n; c++) {
    		if ( pattern == "O") 	pattern ="#";
    		else 					pattern = "O";		
    		System.out.print(pattern);
    	}
		if (n%2 == 0) {
    		if ( pattern == "O") 	pattern ="#";
    		else 					pattern = "O";		    			
		}

    	System.out.println();
    }
}


//     do
//     {
//       System.out.print("Enter an integer from 4 to 20: ");
//       n = kb.nextInt();
//     } while (n < 4 || n > 20);
// 
//     kb.close();
// 
//     System.out.println();
//     System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
//     System.out.println(n + "! = " + factorial(n));
//     System.out.println("Primes: ");
//     for (int k = 1; k <= n; k++)
//       if (isPrime(k))
//         System.out.print(k + " ");
//     System.out.println();
//     System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));
//     System.out.println("The first four perfect numbers are: 6, 28, 496, 8128");
  }


