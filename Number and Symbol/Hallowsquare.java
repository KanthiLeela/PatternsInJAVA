public class Hallowsquare {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
          System.out.print(i+" ");
        }
        System.out.println();
        //second layer
        for(int j=1;j<n;j++){
            System.out.print(1);
            for(int k=1;k<n;k++){
                System.out.print(" ");
            }
            System.out.print(2);
            System.out.println();


        }
    }
    
}
