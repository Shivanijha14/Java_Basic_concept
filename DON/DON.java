import java.util.Scanner;
class DON{
  public static void main(String[]args){
    Scanner src = new Scanner(System.in);
        int num = src.nextInt();
       int x = 0;
        int n = num;
      while(num != 0){
            num = num  /10;
             x++;
}
           System.out.println(x);
       int div = (int)Math.pow(10, x-1);
    
           while(n != 0){
           int digit = n/div;
         System.out.println(digit);
          n = n % div;
              div = div / 10;
           }

      
}

	
}
