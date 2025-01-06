/*Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE*/

import java.util.*;
public class Character2 {
	public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		  for (int i = 0; i < N; i++) {
            // Calculate the starting character for each row
            char startChar = (char) ('A' + N - 1 - i);
            // Build and print the row
            for (char ch = startChar; ch <= 'A' + N - 1; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
	}
}