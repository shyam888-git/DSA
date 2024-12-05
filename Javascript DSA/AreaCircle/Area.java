public class CricleArea{
    public static void PrintArea(double radius){
        double result=Math.PI*radius*radius;
        System.out.println("Area of circle is "+""+result);
    }
    public static void main(String[]args){
        double r=3.25;
        PrintArea(r);
        
    }
}