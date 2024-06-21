
/* 
   1 
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5 */


import java.util.Scanner;
public class righttriangleno {
    public static void main(String[] args) {
        int i, j;
        Scanner read= new Scanner(System.in);
        System.out.println("Enetr n: ");
        int n = read.nextInt();
        for(i=1;i<=n;i++){
            for(j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

        
    }
}
