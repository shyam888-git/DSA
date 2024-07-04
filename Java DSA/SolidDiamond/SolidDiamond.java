class SolidDiamond
 {
    public static void main(String[] args) {
      int n=6;
      //full pyramid
      for(int row=0;row<n;row++){
            for(int col=0;col < n- row-1 ;col++){
                System.out.print(" ");
            }
            for(int col=0; col < row +1 ; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        //inverted full pyramid
      for(int row=0;row<n;row++){
          //space
          for(int col=0;col<n+row-n ;col++){
              System.out.print(" ");
          }
          for(int col=0;col<n-row;col++){
              System.out.print("*  ");
          }
          System.out.println();
      }
      
        
    }
}
