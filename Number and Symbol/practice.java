
// /*
//  * X 0 X 0
//  * 0 X 0 X
//  * X 0 x 0
//  * 0 X 0 X
//  */
// public class practice {
//     public static void main(String[] args) {
//         int size = 5;
//         for(int i =1;i<=size;i++)
//         {
//             for(int j =1;j<=size;j++)
//             {
//                 if(i%2==0){
//                     if(j%2==0)
//                     {
//                         System.out.print("X"+" ");
//                     }
//                     else{
//                         System.out.print("0"+" ");
//                     }
//                 }
//                 else{
//                     if(j%2==0)
//                     {
//                         System.out.print("0"+" ");
//                     }
//                     else
//                     {
//                         System.out.print("x"+" ");
//                     }
                    
//                 }
//             }
//             System.out.println();
//         }
       
//     }
// }

/*
 Descending order pattern

 5
 5 4 
 5 4 3
 5 4 3 2 
 5 4 3 2 1
 */

//  public class practice {
 
//     public static void main(String[] args) {
//         for(int i =0;i<5;i++)
//         {
//             int p=5;
            
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("*");
//                 p--;

//             }
//             System.out.println();
//         }
//     }
//  }


/*
  1
 1 1
 2 2 2 
3 3 3 3  
 */
// public class practice {

//     public static void main(String[] args) {
//         int s=5;
//         for(int i=0;i<=s;i++)
//         {
//             for(int j=0;j<=s-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i-1;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
        
//     }
// }
/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
 */

public class practice {

    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % n + 1+" ");
                // if (j < n - 1) {
                //     System.out.print(" ");
                // }
            }
            System.out.println();
        }
    }
}