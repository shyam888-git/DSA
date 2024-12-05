
import java.util.Scanner;
class ReverseArray{
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        
        int r;
        
        while(n>0){
            
            r=n%10;
            
            System.out.println(r);
            n=n/10;
        }
        
        
    }
}