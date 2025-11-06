import  java.util.Scanner;

class Calculator{
    static int add(int a, int b){
     return a +b;
   }
    
    static int sub(int a, int b){
      return a -b;
    }
    
    static int multiplication(int a, int b){
      return a * b;
   }

    static int division(int a, int b){
      return a / b;
   }

 public static void main(String[]args){
    Scanner src = new Scanner(System.in);

    System.out.print("Enter First number:");
      int num1 = src.nextInt();

    System.out.print("Enter Second number:");
      int num2 = src.nextInt();

   System.out.println("Addition:" + add(num1, num2));
   System.out.println("Subtraction:" + sub(num1, num2));
   System.out.println("Multiplication:" + multiplication(num1, num2));
   System.out.println("Division:" + division(num1, num2));
}
}
