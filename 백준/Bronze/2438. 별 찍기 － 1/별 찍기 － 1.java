import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int num = scanner.nextInt();
    
    for(int i=0; i<num; i++) {
      for(int k=i; k>=0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
    

  }
}
