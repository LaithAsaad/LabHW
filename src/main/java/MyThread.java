import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread{

    private String name;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    private int start;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    private int end;

    public List<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }

    private List<Integer> primes = new ArrayList<>();
    public MyThread(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

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
}
