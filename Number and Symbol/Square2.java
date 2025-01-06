/*

● Printing a square pattern of even X odd O
 x  o  x  o  x  o 
 x  o  x  o  x  o
 x  o  x  o  x  o
 x  o  x  o  x  o
 x  o  x  o  x  o
 x  o  x  o  x  o
 */

public class Square2 {
public static void main(String[] args) {
    int n =6;
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++)
        {
            if(j%2 == 0){
                System.out.print(" x"+" ");
            }
            else{
                System.out.print(" o"+" ");
            }
        }
        System.out.println();
    }
}    
}
