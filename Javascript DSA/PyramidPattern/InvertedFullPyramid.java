class InvertedFulllPyramid {
    public static void main(String[] args) {
      int n=6;
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
