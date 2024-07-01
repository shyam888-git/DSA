// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//1,2,3,4,5
//2,3,4,
//5%2==0;
//5%3==0
//5%4==0
class PrimeNumber {
    public static void main(String[] args) {
       int n=5;
       for(int i=2;i<=n-1;i++){//i=1
           if(n%i==0){
               System.out.println("Given number is a prime number");
           }
           else{
               System.out.println("Not a prime number");
           }
       }
    }
}