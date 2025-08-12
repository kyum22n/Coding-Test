import java.util.Scanner;

class Main {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);

    	int sum = 0;
    	
        for(int i=1; i<5; i++) {
        	int result = scanner.nextInt();   
        	sum += result;
        }

        if(sum > 1500) {
        	System.out.println("No");
        } else {
        	System.out.println("Yes");
        }
        
        }
}