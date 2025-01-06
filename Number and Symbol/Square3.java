
/*
 * X 0 X 0
 * 0 X 0 X
 * X 0 x 0
 * 0 X 0 X
 */
public class Square3 {
    public static void main(String[] args) {
        int size = 5;
        for(int i =1;i<=size;i++)
        {
            for(int j =1;j<=size;j++)
            {
                if(i%2==0){
                    if(j%2==0)
                    {
                        System.out.print("X"+" ");
                    }
                    else{
                        System.out.print("0"+" ");
                    }
                }
                else{
                    if(j%2==0)
                    {
                        System.out.print("0"+" ");
                    }
                    else
                    {
                        System.out.print("x"+" ");
                    }
                    
                }
            }
            System.out.println();
        }
       
    }
}
