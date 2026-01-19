import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int numberA = scanner.nextInt();       
        int numberB = scanner.nextInt();
       
        int result = numberA - numberB;
        
        System.out.println(result);
    }    
}