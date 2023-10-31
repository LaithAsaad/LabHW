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

    public void testMyThread()
    {
        long start = System.currentTimeMillis();
        int start_number = 1;
        int end_number = 100000000;
        List<MyThread> threadList = new ArrayList<MyThread>();
        for(int i=0; i<10; i++)
        {
            MyThread thread = new MyThread("thread",(int)(((double)i/10)*end_number), (int)(((double)(i+1)/10)*end_number));
            thread.start();
            threadList.add(thread);
        }
        for(MyThread thread : threadList)
        {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time is "+ (end-start)/1000+ " seconds");
    }
}
