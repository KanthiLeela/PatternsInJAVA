/*
 ● Printing a square pattern using numbers.
 Expectedoutput:
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5
 */
public class Square1 {
    public static void main(String[] args) {
        for(int i =0;i<5;i++)
        {
            for(int j=0;j<5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
