public class Primes {
    public static void main(String[] args) {
        int n;
        if (args.length == 0) {
            n = 7;
        }
        else {
            n = Integer.parseInt(args[0]);
        }

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

        System.out.println("Prime numbers up to " + n + ":");

        int cnt = 0;
        for (int j = 2; j <= n; j++) {
            if (isPrime[j]){
                System.out.println(j);
                cnt ++;
            }
        }
        
        int perc = (cnt* 100) /n;
        System.out.println("There are " + cnt + " primes between 2 and "+ n + " (" + perc + "% are primes)");
        }
    }