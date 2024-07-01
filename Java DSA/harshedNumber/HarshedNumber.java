public class HarshedNumber{
    
    public static void main(String[]args){
        
        int num=156;
        int rem=0;
        int sum=0;
        int n=num;
        
        while(num>0){
            
            rem=num%10;
            sum=rem+sum;
            num=num/10;
        }
        
        System.out.println("Sum of the digit is" + sum);
        
        if(n%sum==0){
            
            System.out.println(n+"is a harshed number");
        }
        else{
            
            System.out.println(n+"is a not a harshed number");
        }
    }
}