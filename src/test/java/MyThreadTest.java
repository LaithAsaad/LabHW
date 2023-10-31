import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class MyThreadTest extends TestCase {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void testIsPrim()
    {
        boolean primeNumber = isPrime(49);
        if(primeNumber)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");

    }
}
