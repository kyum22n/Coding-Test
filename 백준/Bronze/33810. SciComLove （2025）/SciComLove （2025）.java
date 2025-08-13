import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   String s = scanner.nextLine();
   String favorite = "SciComLove";
   
   int num = 0;
   
   if(s.length() == 10 ) {
     for(int i=0; i<10; i++) {
       if(s.charAt(i) != favorite.charAt(i)) {
         num += 1;
       }
     }
     System.out.println(num);
   }
  }

}
