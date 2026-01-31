import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String ab = a + b;
        String result = ab.replace(" ", "");
        
        System.out.println(result);
    }
}