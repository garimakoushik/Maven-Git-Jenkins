package garima;

public class IsPrimeNumber {

    public boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2 ; i < n ; i++) {
            if (n%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}

