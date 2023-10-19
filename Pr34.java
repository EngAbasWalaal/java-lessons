import java.util.Scanner;
public class Pr34{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime=isPrime(n);
        
        if(isPrime){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }

    //function to chech whether a number is prime or not
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n <= 3){
            return true;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i=5; i*i <=n; i+=6){
            if(n % i==0 || n % (i + 2) ==0){
                return false;
            }
        }
        return true;
    }
}