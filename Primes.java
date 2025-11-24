public class Primes {
    public static void main(String[] args) {
        int n = 30;
        boolean[] isPrime = new boolean[n+1]; 
        for (int i = 2 ; i <= n ; i++){
            isPrime[i] = true;
            }
        
        int p = 2;
        while (p*p <= n){
            if (isPrime[p]){
                int multi = p*p;
                while (multi <= n){
                    isPrime[multi] = false;
                    multi += p;
                }
            }
            p++;
        }

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]){
                System.out.println(i);
                cnt ++;
            }
        }
        
        double perc = (cnt* 100.00) /n;

        System.out.println("There are " + cnt + " primes between 2 and "+ n + " (" + (int) perc + "% are primes)");
        }
    }