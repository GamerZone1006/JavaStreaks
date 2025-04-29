import java.util.ArrayList;

public class game1 {
    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev;
    }

    public static int sumofDig(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return sum;
    }

    public static int gcd(int a, int b){
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int factors(int n){
        for(int i=2;i<=n;i++){
            if (n%i==0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // Level 1
        int[] players = { 10, 23, 29, 15, 60, 7, 11 };
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            sum += players[i];
        }
        double avg = (double) sum / players.length;
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < players.length; i++) {
            if (isPrime(players[i])) {
                primes.add(players[i]);
            }
        }
        ArrayList<Integer> finalLevelOne = new ArrayList<>();
        for (int num : primes) {
            if (num > avg) {
                finalLevelOne.add(num);
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Level 1 Winners: " + finalLevelOne);
        System.out.println("--------------------------------------------------------");

        // Level 2
        ArrayList<Integer> sumLevelTwo = new ArrayList<>();
        for (int num : finalLevelOne) {
            int reversed = reverse(num);
            int sumofdig = sumofDig(reversed);
            if (sumofdig % 2 == 0) {
                sumLevelTwo.add(sumofdig);
            } else {
                sumofdig += 1;
                sumLevelTwo.add(sumofdig);
            }
        }
        System.out.println("Level 2 Winners: " + sumLevelTwo);
        System.out.println("--------------------------------------------------------");

        // Level 3
        ArrayList<Integer> multiple = new ArrayList<>();
        for (int num : sumLevelTwo) {
            int n1 = 0, n2 = 1;
            int count = 0;
            for (int i = 0; i < num; i++) {
                int fib = (i == 0) ? 0 : (i == 1) ? 1 : n1 + n2;
                if (i > 1) {
                    n1 = n2;
                    n2 = fib;
                }
                if (fib % 3 == 0 || fib % 5 == 0) {
                    count++;
                }
            }
            multiple.add(count);
        }
        System.out.println("Level 3 Winners: " + multiple);
        System.out.println("--------------------------------------------------------");

        //Level 4
        int l1 = 23;
        int l3 = 5;
        int mastercode = 1;
        int result = gcd(l1, l3) * 7;
        if (result < 500) {
            mastercode = result*result;
        }
        System.out.println("Mastercode from level 4: "+mastercode);
        System.out.println("--------------------------------------------------------");

        //Level 5
        int sumMC = sumofDig(mastercode);
        if (mastercode%11 == 0 && sumMC%2 == 0) {
            System.out.println("AI TERMINATED, MISSION SUCCESSFUL!");
        }
        else{
            int mc = mastercode;
            int fctrs = factors(mc);
            if (isPrime(fctrs)) {
                System.out.println("AI TERMINATED, MISSION SUCCESSFUL!");
            } 
            else{
                System.out.println("SYSTEM ERROR!");
            }
        }
        System.out.println("--------------------------------------------------------");
    }
}