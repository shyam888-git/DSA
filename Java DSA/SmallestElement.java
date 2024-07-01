public class Smallest_Elment{
    
    public static void main(String[]args){
        
         int arr[]=new int[]{10,20,30,40,50};
           int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(min>arr[i])
                 min=arr[i];
            }
            System.out.println("The smallest number is"+min);
    }
}