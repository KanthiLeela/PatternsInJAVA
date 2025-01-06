/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 5
E
ED
EDC
EDCB
EDCBA

Reverse character pattern

 */
import java.util.Scanner;

public class Character3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       for (int i = 0; i < n; i++) {
          
            for (int j = 0; j <= i; j++) {
               
                char ch = (char) ('A' + n - 1 - j);
                System.out.print(ch);
            }
       
            System.out.println();
        }
    }
}
