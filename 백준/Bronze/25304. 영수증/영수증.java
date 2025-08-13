import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int total = scanner.nextInt();
    int sort = scanner.nextInt();
    int price;
    int num;
    
    int sum = 0;
    
    for(int i=0; i<sort; i++) {
      price = scanner.nextInt();
      num = scanner.nextInt();
      
      sum += num*price;

    }

    if(total == sum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    

  }
}
