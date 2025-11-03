import java.util.Scanner;


class RON{
  public static void main(String[]args){
   Scanner src = new Scanner(System.in);
    String num = src.nextLine();
    String rev = "";

  for(int i = num.length()-1; i >= 0; i--){
       rev  = rev + num.charAt(i);
  }
     System.out.println(rev);
 }
}
