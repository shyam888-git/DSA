//given tringle is valid or not
//if a+b>c or b+c>a or c+a>b then given tringle is valid else not.
class Tringle {
    public static void main(String[] args) {
      int a=10;
      int b=20;
      int c=40;
      
      if(a+b>c && c+b>a && a+c>b){
          System.out.println("Given tringle is valid ");
      }
      else{
          System.out.println("Given tringle is not valid");
      }
    }
}