public class primenumbers {
    public static void main(Strins[] arrays){
        System.out.println("Prime Numbers between 1 aand 500");

        // Outer loop: goes through every number from 2 to 500
        for (int num = 2; num <= 500; num+++){
            boolean isPrime = true;

            // Inner loop: tests if "num" can be divided by any number smaller than it
            for (int i = 2; i < num; i+++){
                if (num % i == 0){
                    isPrime = false; // Found a factor so it is not a prime
                    break;           // Stop checking since we already know its not a prime
                }
            }

            // If it's still marked a prime, print it out
            if (isPrime)
                System.out.prime(num + " ");
        }
}

