package week4;

public class Primes {
	public static boolean isPrime(int x){
		for(int i = 2; i <= Math.sqrt(x); i++){
			if(x % i == 0) return false;
		}return true;
	}
	public static void printPrimes(int x){
		int counter = 0;
		int i = 2;
		while(counter < x){
			if(isPrime(i)){
				System.out.println(i);
				counter++;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		printPrimes(10);
	}
}
