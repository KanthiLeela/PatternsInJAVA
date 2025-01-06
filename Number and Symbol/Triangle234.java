public class Triangle234 {
    /*
Trianle 2
Expected output:

     1
     1 2
     1 2 3
     1 2 3 4

     */
    // public static void main(String[] args) {
    //     int size =5;
    //     for(int i =0;i<size;i++){
    //         for(int j=0;j<=i;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

  /*   Trianle 3
Expected output:

     1
     2 3
     4 5 6
     7 8 9 10

     */
// public static void main(String[] args) {
//     int s=5;
//     int p=1;
//     for(int i=0;i<=s;i++)
//     {
//         for(int j=0;j<=i;j++)
//         {
//             System.out.print(p+" ");
//             p=p+1;
//         }
//         System.out.println();
//     }
// }

/*
 Triangle 3:
 Expected output:
 1
 2 3
 3 4 5
 4 5 6 7
 5 6 7 8 9


 */

public static void main(String[] args) {
    int s=5;
   
    for(int i=0;i<=s;i++)
    {
        int p=i;
        for(int j=0;j<=i;j++)
        {
            System.out.print(p+" ");
            p=p+1;
        }
        System.out.println();
    }
}


}
