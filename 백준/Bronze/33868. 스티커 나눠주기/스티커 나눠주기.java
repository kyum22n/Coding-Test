import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int num = scanner.nextInt(); // 제출 수
    
    int max_T = scanner.nextInt();  // 가장 큰 시간
    int min_b = scanner.nextInt();  // 가장 짧은 코드
    
    for(int i=1; i<num; i++) {
      int t = scanner.nextInt();  
      int b = scanner.nextInt();  
      
      if(max_T < t) {
        max_T = t;
      } 
      if(min_b > b ) {
        min_b = b;
      }
    }
    System.out.println(max_T * min_b % 7 + 1);  // 나머지 + 1 = 스티커 번호    
  }
}
